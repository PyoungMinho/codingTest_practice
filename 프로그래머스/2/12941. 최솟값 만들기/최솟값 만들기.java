import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int aCnt = 0;
        int bCnt = B.length-1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        while (aCnt < A.length){
            answer += A[aCnt]*B[bCnt];
            aCnt++;
            bCnt--;
        }
        return answer;
    }
}