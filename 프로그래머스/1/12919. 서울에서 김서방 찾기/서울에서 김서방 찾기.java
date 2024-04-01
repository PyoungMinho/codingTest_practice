class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
                break;
            }
        }
        System.out.printf("김서방은 %d에 있다",x);
        
        return "김서방은 " + x + "에 있다";
    }
}