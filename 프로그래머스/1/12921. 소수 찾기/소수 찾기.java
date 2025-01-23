public class Solution { 
    public static int solution(int n) { // 메서드 선언
        if (n < 2) return 0; // n이 2보다 작으면 소수가 없음

        boolean[] isPrime = new boolean[n + 1]; // 소수 여부를 저장하는 배열
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // 처음에는 모든 숫자를 소수로 가정
        }

        for (int i = 2; i * i <= n; i++) { // i의 배수를 지움
            if (isPrime[i]) { // i가 소수인 경우
                for (int j = i * i; j <= n; j += i) { // i의 배수를 모두 false로 설정
                    isPrime[j] = false;
                }
            }
        }

        int answer = 0; // 소수의 개수 카운트
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
