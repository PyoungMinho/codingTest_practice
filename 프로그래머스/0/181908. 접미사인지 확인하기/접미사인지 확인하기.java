import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] strArr = new String[my_string.length()]; 
        
        for(int i =0; i< my_string.length(); i++){ 
             strArr[i] = my_string.substring(i,my_string.length());
        }
        
        return Arrays.asList(strArr).contains(is_suffix) ? 1 :0 ;
    }
}

