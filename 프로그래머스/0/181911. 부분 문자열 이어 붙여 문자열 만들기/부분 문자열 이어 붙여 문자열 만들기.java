import java.util.stream.*;

class Solution {
    public String solution(String[] myStrings, int[][] parts) {
        return IntStream.range(0, myStrings.length).mapToObj(i -> myStrings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining());
    }
}