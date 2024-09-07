class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();
        
        return str.contains(str2) ? 1 : 0 ;
    }
}