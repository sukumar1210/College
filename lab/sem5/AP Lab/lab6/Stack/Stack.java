package Stack;

import java.util.ArrayList;

public class Stack{
    ArrayList<Integer> stack = new ArrayList<Integer>();
    int top = -1;
    public void push(int data){
        stack.add(data);
        top++;
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            stack.remove(top);
            top--;
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack.get(top);
        }
    }
    public Boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void printStack(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.print(stack.get(i)+" ");
            }
            System.out.print("\n");
        }
    }
}