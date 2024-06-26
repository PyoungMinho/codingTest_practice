class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0; // cards1의 인덱스
        int j = 0; // cards2의 인덱스

        for (int k = 0; k < goal.length; k++) { 
            if (i < cards1.length && cards1[i].equals(goal[k]))       { i++; } 
            else if (j < cards2.length && cards2[j].equals(goal[k]))  { j++; } 
            else  { return "No"; }
        }

        return "Yes"; 
    }
}
