import java.math.BigInteger;

class Solution {
    public int solution(String number) {
       BigInteger num = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        BigInteger answer = num.remainder(nine);
        return answer.intValue();
    }
}