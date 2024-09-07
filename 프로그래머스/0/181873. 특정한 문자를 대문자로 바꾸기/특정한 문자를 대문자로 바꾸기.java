class Solution {
    public String solution(String my_string, String alp) {
        String myString = my_string.replaceAll(alp, alp.toUpperCase());
        return myString;
    }
}
