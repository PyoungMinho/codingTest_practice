class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = numbers.length;
       
        for (int i = 0; i < k - 1; i++) {
            answer = (answer + 2) % n;
        }
        
        return answer+1;
    }
}