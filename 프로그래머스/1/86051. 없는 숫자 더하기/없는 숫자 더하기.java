class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] intArr = new int[10];
        
        for(int num : numbers){
            intArr[num] = 1; 
        }
        
        for(int i=0; i<intArr.length; i++){
            if(intArr[i] == 0) answer += i; 
        }
        
        return answer;
    }
}