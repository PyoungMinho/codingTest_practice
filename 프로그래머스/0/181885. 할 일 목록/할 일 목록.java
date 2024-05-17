class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cntUnfinished =0;
        for(boolean unfinish : finished){
            if(!unfinish){
                cntUnfinished++;
            }
        }
        
        
        String[] answer = new String[cntUnfinished];
        int idx =0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]== false){
                answer[idx] = todo_list[i];
                idx++;
            }
            
        }
        return answer;
    }
}