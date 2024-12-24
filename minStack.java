// Time Complexity: O(n)

import java.util.Stack;

public class minStack {
    private Stack<Integer> stack;
    private Stack<Integer> miniStack;
    public minStack(){
        stack = new Stack<>();
        miniStack = new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        if(miniStack.isEmpty() || val <= miniStack.peek()) miniStack.push(val);
    }
    public void pop(){
        if(stack.isEmpty()) return;
        int pop = stack.pop();
        if(pop == miniStack.peek()) miniStack.pop();
    }
    public int top(){
        if(stack.isEmpty()) throw new RuntimeException("Stack is empty. Cannot retrieve minimum element.");
        return stack.peek();
    } 
    public int getMin(){
        if(miniStack.isEmpty()) throw new RuntimeException("Stack is empty. Cannot retrieve minimum element.");
        return miniStack.peek();
        
    }
    public static void main(String[] args) {
        minStack a = new minStack();
        a.push(-2);
        a.push(0);
        a.push(-3);
        System.out.println(a.getMin());
        a.pop();
        System.out.println(a.top());
        System.out.println(a.getMin()); 
        
    }

}
