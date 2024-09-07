class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."};
        
        String[] strArr = letter.split(" ");
        
        for(String str : strArr){
            for(int i=0; i<morse.length; i++){
                if(morse[i].equals(str)){
                    answer += (char) (97+i) +"";
                }
            }
        }
        
        return answer;
    }
}