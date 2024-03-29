class Solution {
    public int solution(String[] order) {
        int americanoCount = 0;
        int cafeLatteCount = 0;
        
       for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano") || order[i].equals("anything")) {
                americanoCount++;
            } else if(order[i].contains("cafelatte")) {
                cafeLatteCount++;
            }
        }
        return (americanoCount *4500)+(cafeLatteCount *5000);
    }
}