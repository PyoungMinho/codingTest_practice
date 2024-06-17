class Solution {
    public int solution(int[] sides) {
        int mn = Math.min(sides[0], sides[1]);
        return mn + (mn - 1);
    }
}