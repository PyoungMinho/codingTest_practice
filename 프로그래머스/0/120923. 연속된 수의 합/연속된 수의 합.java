
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = (num - 1) / 2;

        answer[mid] = total / num;

        for (int i = 0; i < num; i++) {
            answer[i] = answer[mid] + (i - mid);
        }

        return answer;
    }
}