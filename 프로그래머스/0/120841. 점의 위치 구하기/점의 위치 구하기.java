
class Solution {
    public int solution(int[] dot) {
        int xParam = dot[0] < 0 ? 1 : 0;
        int yParam = dot[1] < 0 ? 2 : 0;

        return 1 + ((xParam | yParam) ^ (yParam >> 1));
    }
}