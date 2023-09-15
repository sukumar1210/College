import Stack.LimitedSizeStack;
import Stack.ResizableStack;

public class Main {
    public static void main(String[] args) {
        ResizableStack rs = new ResizableStack(2);
        System.out.println("Resizabe stack");
        System.out.println("Current Capacity:" + rs.capacity());
        rs.push(1);
        System.out.println("Current Capacity:" + rs.capacity());
        rs.push(2);
        System.out.println("Current Capacity:" + rs.capacity());
        rs.push(3);
        System.out.println("Current Capacity:" + rs.capacity() + " Automatically resized");
        
        LimitedSizeStack ls = new LimitedSizeStack(2);
        System.out.println("\nLimited size stack");
        ls.push(1);
        System.out.println("Current Stack:");
        ls.printStack();
        ls.push(2);
        System.out.println("Current Stack:");
        ls.printStack();
        ls.push(3);
        System.out.println("Current Stack:");
        ls.printStack();
        
        System.out.println();
        BalancedParanthesis.solution("((()()))(");
        
        ResizableStack rs2 = new ResizableStack(5);
        System.out.println("\nReversal of Elements");
        System.out.println("Inserted: \n1 2 3 4 5");
        rs2.push(1);
        rs2.push(2);
        rs2.push(3);
        rs2.push(4);
        rs2.push(5);
        System.out.println("Reversed:");
        rs2.printStack();

        
    }
}
