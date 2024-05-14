import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrays = new ArrayList<>();
        
        for(int i =2; i<=n; i++) {
           if(n % i == 0) {
                while(n%i==0) {
                    n /= i ;
                }
               arrays.add(i);
            }            
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[arrays.size()];
        for(int i = 0; i < arrays.size(); i++) {
            answer[i] = arrays.get(i);
        }
        return answer;
    }
}