class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] str = my_string.toCharArray();
        
        for(char ch : str){
            if(48<=ch && ch <=57){
                answer+=ch-'0';
            }
        }
        
        return answer;
    }
}