import java.util.*;
public class majority {
    public static int major(int[] arr){
      int n=arr.length;
      int count=0;
      int candidate=-1;
      for(int num:arr){
        if(count==0){
            candidate=num;
            count+=(num==candidate)? 1:-1;
        }
       
      }
      int freq=0;
      for(int num:arr){
        if(num==candidate) freq++;

      }
      if(freq>n/2){
        return candidate;

      }
      else {
        return -1;
      }
     
    }
    public static void main(String[] args){
        int[] arr={1,1,1,2};
        System.out.println(major(arr));
    }
}
