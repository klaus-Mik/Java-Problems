public class candy {
    public static int candies(int[] arr){
        int count=0;
        int n=arr.length;
        int[] candy=new int[n];
         for(int i=0;i<arr.length;i++){
            candy[i]=1;
            
         }
         for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                candy[i]=candy[i-1]+1;
                
            }
         }
         for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
                
            }
         }
         for(int i:candy){
            count+=i;
         }
        return count;
    }
    public static void main(String args[]){
        int[] arr={1,2,2};
        System.out.println(candies(arr));
    }
}
