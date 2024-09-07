import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] digits = Long.toString(n).toCharArray();
        
        Arrays.sort(digits);
        
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        return Long.parseLong(sb.toString());
    }
}