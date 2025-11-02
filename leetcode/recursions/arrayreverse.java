package recursions;

import java.util.Arrays;

public class arrayreverse {
    static int[] reverse(int[] arr, int i , int j){
        
        if(i>=j){
            return arr; 
        }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverse(arr,i+1,j-1);
        

        return  arr;

    }
    public static void main(String[] args) {
        int i=0;
        int[] arr={1,2,3,4,5};
        int j=arr.length-1;
        int[] s=reverse(arr, i, j);
        System.out.println(Arrays.toString(s));
    }
}
