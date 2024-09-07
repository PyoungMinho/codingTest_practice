import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splitArray = myString.split("x");
        Arrays.sort(splitArray);
        
        List<String> resultList = new ArrayList<>();
        for (String str : splitArray) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}