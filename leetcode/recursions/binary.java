package recursions;
import java.util.*;


public class binary {
 static void subseq(int n , String curr, List<String> arr){
    if(n==curr.length()){
        arr.add(curr);
        return;
    }
    subseq(n, curr+"0", arr);
    if(curr.isEmpty() || curr.charAt(curr.length()-1)=='0'){
        subseq(n, curr+"1", arr);
    }

 }
 public static void main(String[] args) {
    int n=5;
    String curr="";
    List<String> arr= new ArrayList<>();
    subseq(n, "", arr);
    System.out.println(arr);
 }

    
}