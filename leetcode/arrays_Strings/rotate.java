import java.util.*;
public class rotate {
    public static void rotatee(int[] arr,int k){

        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

       
    }
    private static void reverse(int[] arr,int left , int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotatee(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
