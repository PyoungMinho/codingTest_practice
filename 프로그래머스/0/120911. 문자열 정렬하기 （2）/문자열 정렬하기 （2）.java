import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] strArr = my_string.split("");
        Arrays.sort(strArr);
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            sb.append(str);
        }
        
        return sb.toString();
    }
}