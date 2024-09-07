import java.util.*;
class Solution {
    public int[] solution(int n) {    
        Set<Integer> set = new TreeSet<>();

        int temp = n;
        for(int i=2; i<=n/2; i++) {
            while (temp%i == 0){    
                temp /= i;   
                set.add(i);
            }
            if (n == 1) break;
        }

        if (set.size() == 0) return new int[] {n};
        else return set.stream().mapToInt(Integer::intValue).toArray();
    }
}