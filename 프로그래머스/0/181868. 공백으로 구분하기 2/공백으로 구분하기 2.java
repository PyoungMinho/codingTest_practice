import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // 문자열을 공백을 기준으로 분리하여 문자열 배열로 변환
        String[] parts = my_string.trim().split("\\s+");

        ArrayList<String> wordsList = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                wordsList.add(part);
            }
        }

        String[] result = new String[wordsList.size()];
        return wordsList.toArray(result);
    }
}