class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            
            if('A' <= ch && ch <= 'Z') ch+=32;
            else if ('a' <= ch && ch <= 'z') ch-=32;
            
            answer +=ch;
            
            
        }
        
        
        return answer;
    }
}