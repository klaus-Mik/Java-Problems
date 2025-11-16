package recursions;
import java.util.*;

public class para {
    static void parantheses(int n, int open, int close, String s , List<String> values){
          if(open==n && close==n){
            values.add(s);
            return;   
          }
          if(open<n){
            parantheses(n, open+1, close, s+"(", values);
        }
        if(close<open){
            parantheses(n, open, close+1, s+")", values);
        }
    }
    public static void main(String[] args) {
        int n=3;
        String s="";
        List<String> values=new ArrayList<>();
        parantheses(n, 0, 0, s, values);
        System.out.println(values);
    }
}
