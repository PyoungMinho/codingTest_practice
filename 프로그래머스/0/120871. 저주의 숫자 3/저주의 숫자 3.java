class Solution {
    public int solution(int n) {
        int result = 0;
        while (n --> 0) {
            ++result;
            while (result % 3 == 0 || Integer.toString(result).contains("3")) {
                ++result;
            }
        }
        return result;
    }
}