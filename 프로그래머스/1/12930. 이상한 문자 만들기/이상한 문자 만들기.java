class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt =0;
        String[] strArr = s.split("");
        
        for(String item : strArr){
            if(item.contains(" ")){
                cnt=0;
            } else {
                cnt++;
            }
            
            if(cnt%2 ==0 ){
                answer += item.toLowerCase();
            } else {
                answer += item.toUpperCase();
            }
        }
        return answer;
    }
}