package stack_queue;
 public class stack {
    int[] arr;
    int top;
    int size;

    stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    void push(int x){
        if(top==size-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack is empyty");
            return -1;
        }
      
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is Empyty");
            return -1;
        }
        return arr[top];
    }
}
