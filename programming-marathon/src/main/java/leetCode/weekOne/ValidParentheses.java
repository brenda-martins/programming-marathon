package leetCode.weekOne;


import java.util.Stack;

public class ValidParentheses {

    private static final String OPEN = "({[";
    private static final String CLOSE = ")}]";


    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("["));
    }

    private static boolean isValid(String s){
        int index = 0;
        var stack = new Stack<Character>();
        char symbol, top;

        while(index < s.length()){
            symbol = s.charAt(index);

            if(OPEN.indexOf(symbol) >= 0){
                stack.push(symbol);
            }else if(CLOSE.indexOf(symbol) >= 0){

                if(stack.empty()){
                    return false;
                }else{

                    top = stack.pop();
                    if(OPEN.indexOf(top) != CLOSE.indexOf(symbol)){
                        return false;
                    }
                }
            }
            index++;
        }
        return stack.isEmpty();
    }
}
