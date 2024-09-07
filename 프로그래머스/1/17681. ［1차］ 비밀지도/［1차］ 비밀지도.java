import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] mergedArray = mergeArrays(n, arr1, arr2);
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (mergedArray[i][j].equals("#")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
        }
        
        return result;
    }
    
    public String[][] mergeArrays(int n, int[] arr1, int[] arr2) {
        String[][] mergedArray = new String[n][n];
        
        for(int i = 0; i < n; i++) {
            String binary1 = toBinaryString(arr1[i], n);
            String binary2 = toBinaryString(arr2[i], n);
            for(int j = 0; j < n; j++) {
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    mergedArray[i][j] = "#";
                } else {
                    mergedArray[i][j] = " ";
                }
            }
        }
        
        return mergedArray;
    }
    
    public String toBinaryString(int num, int length) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        
        for(int i = binary.length(); i < length; i++) {
            sb.append("0");
        }
        sb.append(binary);
        return sb.toString();
    }
}
