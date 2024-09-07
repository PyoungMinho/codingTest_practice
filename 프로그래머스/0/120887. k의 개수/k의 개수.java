class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        for(int m = i; m <= j; m++) {
            str += m+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
}