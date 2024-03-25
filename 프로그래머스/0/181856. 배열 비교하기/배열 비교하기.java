class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int total1 =0;
        int total2 =0;
        
        int index1 = arr1.length;
        int index2 = arr2.length;
        
        if(index1 != index2 ){
            return index1 > index2 ? 1 : -1 ;
        }else{
            for(int i=0; i<index1; i++){
                total1 += arr1[i];
                total2 += arr2[i];
            }
            return (total1 > total2) ? 1 : (total1 < total2) ? -1 : 0;
        }
    }
}