public class rainwater {
    public static int water(int[] arr){
        int q=0;
        int left=0;
        int n=arr.length;
        int right=n-1;
        
        int left_max=0;
        int right_max=0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(right_max>arr[right]){
                    q+=right_max-arr[right];
                }
                else{
                    right_max=arr[right];

                }
                right--;
            } else{
                if(arr[left]>left_max){
                    left_max=arr[left];
                }
                else{
                    q+=left_max-arr[left];
                }
                left++;

            }  
        }
        return q;
    }
    public static void main(String[] args){
        int[] arr={3,1,2,4,0,1,3,2};
        System.out.println(water(arr));
    }
}
