import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder(); 
        Set<Character> chSet = new HashSet<>();
        
        for(char ch : my_string.toCharArray()){
            if(chSet.add(ch)){
                answer += ch;
            }
            
        }
        
        return answer;
    }
}