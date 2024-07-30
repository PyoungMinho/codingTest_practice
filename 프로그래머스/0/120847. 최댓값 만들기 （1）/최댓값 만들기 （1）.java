class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int prev = 0;
        for(int i=1; i<numbers.length; i++){
            if(max < numbers[i]){
                prev = max;
                max = numbers[i];
            }else if(prev < numbers[i]){
                prev = numbers[i];
            }
        }

        return prev*max;
    }
}