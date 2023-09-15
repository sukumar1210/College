package Stack;

public class LimitedSizeStack extends Stack{
    Integer limit;
    public LimitedSizeStack(Integer l){
        super();
        this.limit = l;
    }
    public void setMaxSize(Integer l){
        this.limit = l-1;
    }
    public void push(int data){
        // Removing oldest
        if(this.top == this.limit - 1){
            stack.remove(0);    
            top--;
        }
        super.push(data);

        // Implemnting Circular Buffer
        


    }
}
