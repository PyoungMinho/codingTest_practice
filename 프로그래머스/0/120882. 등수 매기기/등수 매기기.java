import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] avg = new int[score.length];
       
       
        for(int i=0; i<score.length; i++){
            for(int j=0; j<2; j++){
                avg[i] += score[i][j];
            }
        }
        
        
        int[] answer = new int[avg.length];
        
        for(int k=0; k<avg.length; k++){
             answer[k]=1;
            for(int t=0; t<avg.length; t++){   
                if(avg[k]<avg[t]){
                    answer[k]++;
                }
                    
            }
        }
        
        return answer;
    }
}