class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] chStr =my_string.toCharArray();
        
        for(char ch : chStr){
            if(65<=ch && ch<=90){
                sb.append(Character.toLowerCase(ch));
            }else 
                sb.append(Character.toUpperCase(ch));
            
        }
        return sb.toString();
    }
}