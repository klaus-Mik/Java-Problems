package recursions;
import java.util.*;

public class newcombi {
    static void combi(int[] arr,int k,int i, int sum,Set<List<Integer>> values,List<Integer> current){
         if(sum==k){
            List<Integer> Temp=new ArrayList<>(current);
            Collections.sort(Temp);
            
            values.add(new ArrayList<>(Temp));
         }
         if(i==arr.length || sum>k){
            return;
         }
         current.add(arr[i]);
         combi(arr, k, i+1, sum+arr[i], values, current);
         current.remove(current.size()-1);
         combi(arr, k, i+1, sum, values, current);
         
    }
    public static void main(String[] args) {
        int[] arr={2,5,2,1,2};
        int k=5;
        Set<List<Integer>> values= new HashSet<>();
        List<Integer> current=new ArrayList<>();
        combi(arr, k, 0, 0, values, current);
        
        System.out.println(values);
    }
}
