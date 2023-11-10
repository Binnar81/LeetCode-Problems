 import java.util.Stack;
class Solution {
    public static void sortStack(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }
        int lastElement=stack.pop();
        sortStack(stack);
        insertStack(stack,lastElement);
    }
    public static void insertStack(Stack<Integer> stack,int temp){
        if(stack.size()==0|| stack.lastElement()<=temp){
            stack.push(temp);
            return;
        }
        int lastElement=stack.pop();
        insertStack(stack,temp);
        stack.push(lastElement);
    }
    public static void main(String[] args) {
    Stack<Integer> stack=new Stack<>();
    stack.push(4);
    stack.push(5);
    stack.push(2);
    stack.push(1);
        System.out.print("original stack:" +stack);
        System.out.println();
        sortStack(stack);
        System.out.print("Sorted Stack:" +stack);

    }
}