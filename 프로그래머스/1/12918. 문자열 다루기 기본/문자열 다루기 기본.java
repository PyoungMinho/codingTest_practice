class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        int index = ch.length;
        
        if(index != 4 && index != 6){
            answer = false;
        }else{
        
            for(int i=0; i< index; i++){
                    int asc = (int)ch[i];
                    if(asc < 48 || asc > 57){
                        answer = false; 
                        break;
                    }
                }
            
        }
        return answer;
    }
}