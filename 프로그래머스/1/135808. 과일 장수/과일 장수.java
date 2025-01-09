import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCnt = (int)score.length / m;
        int totalCnt = boxCnt*m;
        
        int idx = score.length - totalCnt;

        Arrays.sort(score);        
        while(idx<totalCnt){
            answer += score[idx] * m;
            idx +=m;
        }

        return answer;
    }
}