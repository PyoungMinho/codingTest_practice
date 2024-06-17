class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];
        int min = Math.max(sides[0], sides[1]) - Math.min(sides[0],sides[1]);
        return sum - min - 1;
    }
}