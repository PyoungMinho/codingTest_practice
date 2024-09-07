import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
         // 문자열을 문자 배열로 변환
         char[] beforeArr = before.toCharArray();
         char[] afterArr = after.toCharArray();
        
         Arrays.sort(beforeArr);
         Arrays.sort(afterArr);
        
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}