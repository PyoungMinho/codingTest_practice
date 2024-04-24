class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            
            if(direction.equals("left")){
                answer[i] = numbers[(i+1)%numbers.length];
                }
            else{
                int index = i - 1;
                if (index < 0) {
                    index = numbers.length - 1;
                }
                answer[i] = numbers[index];
            }
            
        }
        return answer;
    }
}