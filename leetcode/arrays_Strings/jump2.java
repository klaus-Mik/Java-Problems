public class jump2 {
   
        public static int jumppp(int[] arr){
           int reach=0;
           int count=0;
           int end=0;
           for(int i=0;i<arr.length-1;i++){
            reach=Math.max(reach,i+arr[i]);
            if(i==end){
                
                end=reach;
                count++;
            }
           }
           return count;
        }
    
          
        public static void main(String[] args){
            int[] arr={2,3,1,1,4};
            System.out.println(jumppp(arr));
    
        }
    
    
}
