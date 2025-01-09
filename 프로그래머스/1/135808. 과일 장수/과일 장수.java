import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0; // 최대 이익을 저장할 변수 초기화
        
        // 사과 점수를 오름차순으로 정렬 (가장 낮은 점수부터 높은 점수 순으로 정렬)
        Arrays.sort(score);

        // 사과 배열을 뒤에서부터 m개씩 그룹으로 나누어 반복
        // (가장 높은 점수부터 m개씩 상자를 구성하고 반복)
        for (int i = score.length; i >= m; i -= m) { 
            // 현재 상자의 최저 점수(score[i - m]) * 상자의 크기(m)를 더해 이익 계산
            answer += score[i - m] * m;
        }

        return answer; // 계산된 최대 이익 반환
    }
}
