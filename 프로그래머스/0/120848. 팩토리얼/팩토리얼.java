class Solution {
    public int solution(int n) {
        int i = 1;
        int fac = 1;
        
        while(fac <= n){
            fac += fac * i ;
            i++;
            
        }
        
        return i-1;
    }
}