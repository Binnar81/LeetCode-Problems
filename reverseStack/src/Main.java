
import java.util.Stack;
class Solution {
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        System.out.print(stack.peek()+ " ");
        stack.pop();
        reverseStack(stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.print(stack);
        System.out.println();
        reverseStack(stack);
        System.out.print(stack+ ",");
    }
}