class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i= 4; i <= n; i++){
            int cnt=0;    
            for(int k=1; k<= i; k++){
                if(i % k == 0){
                    cnt++;
                }
            }
            if(cnt >= 3) answer++;
        }
        
        
        return answer;
    }
}