package recursions;

public class count {
    static int sum(int[] arr , int k,int count, int present, int i){
        if(present>k){
            return 0;
        }
        if(present==k){
            return 1;     
        }
        if(i==arr.length){
            return 0;
        }
       
        
       int take=sum(arr, k, count, present+arr[i], i+1);
       int skip=sum(arr, k, count, present, i+1);
       return take+skip;
       
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       
        
        System.out.println(sum(arr, 9, 0, 0, 0));
    }
}
