class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspStr = rsp.split("");
        
        for(String s : rspStr){
            
            if(s.equals("2")) answer += "0";            
            else if(s.equals("0")) answer+="5";
            else answer +="2";
            
        }
        
        return answer;
    }
}