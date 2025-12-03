package stack_queue;
import java.util.*;

public class nge {
    static void great(int[] arr){
       Stack<Integer> stack=new Stack<>();
       int[] ans=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
       while(!stack.isEmpty() && stack.peek()<=arr[i]){
        stack.pop();
       }
       if(stack.isEmpty()){
        ans[i]=-1;
       }
       else{
        ans[i]=stack.peek();
       }
       stack.push(arr[i]);
       }
       System.out.println((Arrays.toString(ans)));
    }
    public static void main(String[] args) {
        int[] arr={6, 8, 0, 1, 3};
        great(arr);
    }
}
