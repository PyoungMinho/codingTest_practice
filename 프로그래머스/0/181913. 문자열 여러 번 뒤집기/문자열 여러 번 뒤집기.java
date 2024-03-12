class Solution {
    public String solution(String s, int[][] reverse) {
        char[] charArray = s.toCharArray();
        
        for (int[] range : reverse) {
            int start = range[0];
            int end = range[1];
            reverseSubstring(charArray, start, end);
        }
        
        return new String(charArray);
    }
    
    private void reverseSubstring(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}