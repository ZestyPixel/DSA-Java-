package CollectionsFramework.Stack;

import java.util.Stack;

public class _1_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(2)); //Starts from 1 and from top.
        //Because stack implements vector, we can also use methods like add, remove, get, set, etc.
    }
}
