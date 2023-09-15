import Stack.*;
public class BalancedParanthesis {
    public static void solution(String s){
        Stack workingStack = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                workingStack.push(1);
            }
            else if(s.charAt(i) == ')'){
                if(workingStack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                else{
                    workingStack.pop();
                }
            }
        }
        if(workingStack.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
