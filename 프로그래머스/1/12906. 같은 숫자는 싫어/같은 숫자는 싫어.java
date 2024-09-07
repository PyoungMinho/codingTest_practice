import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> resultList = new ArrayList<>();
  
        resultList.add(arr[0]);
   
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
