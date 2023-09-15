package Stack;

public class ResizableStack extends Stack {
    
    Integer capacity;

    public ResizableStack(Integer c){
        super();
        this.capacity = (c);
    }

    public int capacity(){
        return this.capacity;
    }

    public void resize(int newCapacity){
        this.capacity = newCapacity;
    }

    public void push(int data){
        if(this.top == this.capacity-1){
            this.capacity++;
        }
        super.push(data);
    }
}
