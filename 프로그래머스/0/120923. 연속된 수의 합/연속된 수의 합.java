class Solution {
    public int[] solution(int num, int total) {
        //첫 번째 숫자 계산
        int first = (total - (num *(num -1)) /2) / num;
        
        int[] answer = new int[num] ;
        
        for(int i=0; i< num ; i++){
            answer[i] = first +i;
        }
        
        
        return answer;
    }
}