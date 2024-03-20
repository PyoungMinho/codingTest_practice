import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        // 정수 배열을 스트림으로 변환하고, 각 숫자를 이진수로 변환한 후 가장 왼쪽에 위치한 1의 위치를 계산하고,
        // 이를 모두 더하여 반환
        return Arrays.stream(num_list)
                     .map(i -> Integer.toBinaryString(i).length() - 1) // 이진수의 길이에서 1을 뺀 값을 반환
                     .sum(); // 모든 연산 결과를 합산하여 반환
    }
}