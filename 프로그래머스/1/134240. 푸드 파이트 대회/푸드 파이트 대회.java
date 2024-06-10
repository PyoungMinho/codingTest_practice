class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        // 나누기 2를 통해서 한쪽 완성
        for(int i=1; i<food.length; i++){
            int foods = food[i] / 2;
            for(int j = 0; j < foods; j++){ sb.append(i); }    
        }
        
        // 양쪽 순서 만들기
        String left = sb.toString();
        String right = sb.reverse().toString();
        
        // String이니깐 단순하게 순서 맞추기
        return left+"0"+right;
        // return left+food[0]/2+right;
    }
}