class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order); // 정수를 문자열로 변환
        
        for (char digit : orderStr.toCharArray()) { // 각 자리수 확인
            if (digit == '3' || digit == '6' || digit == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}
