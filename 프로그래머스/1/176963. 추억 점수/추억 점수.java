
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        
       for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]); // 이름과 나이를 맵에 추가
        }
            
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            
            for(int j=0; j<photo[i].length; j++){
                Integer friend = map.get(photo[i][j]); //map에 해당 키값이 있는 경우 
                    
                if (friend != null) { sum += friend; } // 존재하는 경우 나이 합산 
            }
            
            answer[i] = sum; // 사진마다의 나이 합계를 answer에 배열 저장
        }
        return answer;
    }
}