class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(' ');
                continue;
            }
            
           if (Character.isUpperCase(c)) {
                sb.append((char) ((c - 'A' + n) % 26 + 'A'));
            }
        
            else if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
            
            
        }
        
         return sb.toString();
    }
}