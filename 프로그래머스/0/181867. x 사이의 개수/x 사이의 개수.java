import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> lengths = new ArrayList<>();
        int count = 0;

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                lengths.add(count);
                count = 0;
            } else {
                count++;
            }
        }

        lengths.add(count);

        return lengths.stream().mapToInt(Integer::intValue).toArray();
    }
}