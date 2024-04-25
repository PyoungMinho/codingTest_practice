import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char) (k + '0');

        
        String str = "";
        for(int o=i; o<=j; o++){
            str += o;
        }
        
        char[] chArr =str.toCharArray();
        for(char ch : chArr){
            if(target == ch){
                answer ++;
            }
        }
    
        
        return answer;
    }
}