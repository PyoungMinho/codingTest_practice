class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replaceAll("A", "x").replaceAll("B", "A").replaceAll("x", "B");
        
        return str.contains(pat) ? 1 : 0;
    }
}