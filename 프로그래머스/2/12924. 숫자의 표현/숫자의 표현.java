class Solution {
  public int solution(int n) {
      int answer = 0;
      int temp =0;
        int count =0;
        int count2 =0;

        for(int j =0; j< n/2; j++){
            temp = 0;
            for(int i=count; i< n/2+1; i++){
                temp += i+1;
                if(temp == n){
                    break;
                }else if (temp > n){
                    break;
                }
            }
            if(temp == n){
                answer++;
            }
            count++;
        }
      return answer+1;
  }
}