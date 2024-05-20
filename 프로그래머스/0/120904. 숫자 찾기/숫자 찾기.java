class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = num+"";
        String[] strArr = str.split("");
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals(k+"")){
                answer = i+1;
                    break;
            }
            else answer = -1;
        }
        
        
        return answer;
    }
}