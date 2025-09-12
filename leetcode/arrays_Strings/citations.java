import java.util.Arrays;
import java.util.Collections;

public class citations {
    public static int citation(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Integer[] arr={1};
        System.out.println(citation(arr));

    }
}
