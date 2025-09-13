import java.util.Arrays;

public class product {
    public static void pro(int[] arr){
        /* int left=0;
        int n=arr.length;
        int right=arr.length-1;
        int product=1;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            while(left<i){
                product*=arr[left];
                left++;
            }
            while(right>i){
                product*=arr[right];
                right--;
            }
            result[i]=product;
            left=0;
            right=arr.length-1;
            product=1;]
        
            
        }
        System.out.println(Arrays.toString(result));*/ 

        int n=arr.length;
        int[] result=new int[n];
       
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*arr[i-1];
        }
         int suffix=1;
         for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix*=arr[i];
         }
         System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args){
        int[] arr={-1,1,0,-3,3};
        pro(arr);
    }
}
