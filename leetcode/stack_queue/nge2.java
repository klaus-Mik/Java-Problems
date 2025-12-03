package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class nge2 {
    static void great(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        
        Arrays.fill(ans, -1);

        for(int i = 2*n - 1; i >= 0; i--){
            int indx = i % n;

            while(!stack.isEmpty() && arr[stack.peek()] <= arr[indx]){
                stack.pop();
            }

            if(i < n && !stack.isEmpty()){
                ans[indx] = arr[stack.peek()];
            }

            
            stack.push(indx);
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};
        great(arr);
    }
}
