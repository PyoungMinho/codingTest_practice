class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = cipher.length() / code;
        
        for(int i=1; i<=idx; i++){
            
                answer += cipher.charAt(i*code-1);
                        
        }
        
        return answer;
    }
}