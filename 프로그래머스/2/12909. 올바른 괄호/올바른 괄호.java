import java.util.*;
    
class Solution {
    boolean solution(String s) {
      if(s.charAt(0) == ')') return false; // 무조건 false 인 경우

    Stack<Character> stack = new Stack<>();

    try{
      for (char c : s.toCharArray()) {
        if(c == '(') stack.push(c);
        else if(c == ')') stack.pop(); // size 0에서 pop하면 exeception터짐
      }
    }catch (Exception e){
      return false;
    }


    return stack.size() == 0 ? true : false;
    }
}