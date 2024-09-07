public class Solution {
    public static String solution(String myString, String pat) {
        int n = myString.length();
        int m = pat.length();

        if (m >= n) {
            return myString;
        }

        for (int i = n - m; i >= 0; i--) {
   
            if (myString.substring(i, i + m).equals(pat)) {
                return myString.substring(0, i + m);
            }
        }

        return ""; 
    }
}
