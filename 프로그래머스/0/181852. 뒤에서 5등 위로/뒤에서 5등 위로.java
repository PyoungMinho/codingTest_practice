import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        int index = num_list.length;
        return Arrays.copyOfRange(num_list, 5 , num_list.length);
    }
}