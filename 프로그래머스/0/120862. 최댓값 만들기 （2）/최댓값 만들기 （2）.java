import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }
}
