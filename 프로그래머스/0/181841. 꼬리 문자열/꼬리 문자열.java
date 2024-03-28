import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (String str : str_list) {
            if (!str.contains(ex)) {
                stringBuilder.append(str);
            }
        }
        
        return stringBuilder.toString();
    }
}