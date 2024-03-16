class Solution {
    public int[] solution(int start, int end) {
        int[] answer;
        if (start >= end) {
            answer = new int[start - end + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = start - i;
            }
        } else {
            answer = new int[end - start + 1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i;
            }
        }
        return answer;
    }
}