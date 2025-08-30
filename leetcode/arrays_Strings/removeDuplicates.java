import java.util.*;
public class removeDuplicates {
    public static void remove(int[] arr){
        Map<Integer,Integer> s=new HashMap<>();
        int k=0;
        for(int i=0;i<arr.length;i++){
          int count=s.getOrDefault(arr[i],0);
          if(count<2){
            arr[k]=arr[i];
            k++;
            s.put(arr[i],count+1);
          }
        }
        
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
    }
    public static void main(String[] args){
        int[] arr={1,1,1,3,4,5,6,6,7};
        remove(arr);
    }
}
