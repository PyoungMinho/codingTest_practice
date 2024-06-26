import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));

        String answer = "Yes";
        for(String str:goal) {
            if(!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
                card1Ary.remove(0);
            } else if(!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
                card2Ary.remove(0);
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}