import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        ArrayList<Long> arrLong = new ArrayList<>();
        for(long i = x; arrLong.size() < n; i += x){
            arrLong.add(i);
        }
        
        for (int i = 0; i < n; i++) {
            answer[i] = arrLong.get(i);
        }
        
        return answer;
    }
}