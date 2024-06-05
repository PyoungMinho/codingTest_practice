class Solution {
    public int solution(int[] num_list) {
        int idx = num_list.length;
        int answer = (idx >= 11) ? 0 : 1;
        
        if(idx >= 11){
            for(int i : num_list) answer += i;
            
        }else 
            for(int i : num_list) answer *= i; 
        
        
        return answer;
    }
}