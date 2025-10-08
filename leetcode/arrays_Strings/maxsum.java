public class maxsum {
    public static int maxSum(int[] arr){
        int s=arr[0];
        int sum=0;
        for(int i:arr){  
            sum+=i;
            s=Math.max(sum, s);
            if(sum<0){
                sum=0;
            }
        }
        return s;
    }
    public static void main(String[] args){
        int[] arr={1,4,-2,3,-5,8,9,3,2};
        System.out.println(maxSum(arr));
    }
}
