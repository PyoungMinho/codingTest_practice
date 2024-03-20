class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        int n = myString.length();
        int m = pat.length();
        
        for (int i = 0; i <= n - m; i++) {
            if (myString.substring(i, i + m).equals(pat)) {
                return 1; 
            }
        }
        return 0; 
    }
}