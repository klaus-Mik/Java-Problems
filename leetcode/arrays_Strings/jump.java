public class jump {
    public static boolean jumppp(int[] arr){
       int reach=0;
      
       for(int i=0;i<arr.length;i++){
        if(i>reach){
            return false;
        }else{
            reach=Math.max(reach, i+arr[i]);
            
        }
       }
       return true;
    }

      
    public static void main(String[] args){
        int[] arr={1,1,0,4};
        System.out.println(jumppp(arr));

    }
}
