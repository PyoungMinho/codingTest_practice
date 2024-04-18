class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i : array){
             String str = String.valueOf(i);
             sb.append(str);
        }
        
        String result = sb.toString();
        for (int j = 0; j < result.length(); j++) {
            if (result.charAt(j) == '7') {
                answer++;
            }
        }
       
        return answer;
    }
}