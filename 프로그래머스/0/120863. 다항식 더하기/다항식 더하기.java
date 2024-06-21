import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xCoefficient = 0;  // x의 계수를 저장하는 변수
        int constant = 0;  // 상수항을 저장하는 변수
        
        // 공백을 기준으로 문자열을 분할합니다.
        String[] terms = polynomial.split(" ");
        
        for (String term : terms) {
            // '+'는 건너뜁니다.
            if (term.equals("+")) {
                continue;
            }
            
            // 'x'가 포함된 항인 경우
            if (term.contains("x")) {
                // 'x'만 있는 경우 계수는 1로 간주합니다.
                if (term.equals("x")) {
                    xCoefficient += 1;
                } else {
                    // 'x'가 포함된 경우, 'x'를 제거한 후 숫자로 변환하여 계수에 더합니다.
                    xCoefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                // 상수항인 경우, 숫자로 변환하여 상수에 더합니다.
                constant += Integer.parseInt(term);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        // x의 계수가 0이 아닌 경우 결과 문자열에 추가합니다.
        if (xCoefficient != 0) {
            if (xCoefficient == 1) {
                answer.append("x");
            } else {
                answer.append(xCoefficient).append("x");
            }
        }
        
        // 상수항이 0이 아닌 경우 결과 문자열에 추가합니다.
        if (constant != 0) {
            if (answer.length() != 0) {
                answer.append(" + ");
            }
            answer.append(constant);
        }
        
        // 결과 문자열이 비어 있는 경우 "0"을 반환합니다.
        if (answer.length() == 0) {
            return "0";
        }
        
        return answer.toString();
    }
}
