import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
      
        String s ="";
        String[] strArr = my_string.split("");
        Arrays.sort(strArr);

        for(String str : strArr){
            if(str.matches(".*[0-9].*")){
                s+= str;
            }
        }
        
        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}