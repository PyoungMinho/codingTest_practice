import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for(int i : arr){
            if(i % divisor == 0){
                intArr.add(i);        
            }
        }
        if(intArr.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(intArr); // ArrayList를 정렬
        
        int[] answer = new int[intArr.size()];
        for (int i = 0; i < intArr.size(); i++) {
            answer[i] = intArr.get(i);
        }
        
        return answer;
    }
}
