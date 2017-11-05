package leetcode;

import java.util.Stack;

public class valid {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else if (c==')'||c==']'||c=='}'){
                if (stack.size() == 0){
                    return false;
                }
                char cpop = stack.pop();
                if(cpop=='(' &&c==')'){
                    continue;
                }else if (cpop=='[' &&c==']'){
                    continue;
                }else if (cpop=='{' &&c=='}') {
                    continue;
                }
                return  false;
            }
        }
        return stack.size()==0;
    }
}
