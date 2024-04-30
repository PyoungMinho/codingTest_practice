import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] beArr = before.toCharArray();
        char[] afArr = after.toCharArray();
        
        Arrays.sort(beArr);
        Arrays.sort(afArr);
        
        return Arrays.equals(beArr, afArr) ? 1 : 0;
    }
}