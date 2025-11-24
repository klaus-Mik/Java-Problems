package recursions;
import java.util.*;

public class combination {
    static void combi(int[] arr, int k, int i,int sum,List<List<Integer>> values,List<Integer> current){
        if(sum==k){
            values.add(new ArrayList<>(current));
            return;
        }
        if(i==arr.length|| sum>k){
            return;
        }
        current.add(arr[i]);
        
        combi(arr, k, i+1, sum+arr[i], values, current);
       
        current.remove(current.size()-1);
        combi(arr, k, i+1, sum, values, current);
      
        
    }
    public static void main(String[] args) {
        int k=5;
        int[] arr={2,5,2,1,2};
        List<List<Integer>> values=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
       combi(arr, k, 0, 0, values, current);
       System.out.println(values);
}}
