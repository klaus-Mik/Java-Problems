package stack_queue;
import java.util.*;

import java.util.ArrayList;

public class prefix {
    static void pref(String s){
       Stack<String> stack= new Stack<>();

       
       for(int i=s.length()-1;i>=0;i--){
        char c= s.charAt(i);
        if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
            String opr1=stack.pop();
            String opr2=stack.pop();
            String ver="("+opr1+" "+c+" "+opr2+")";
            stack.push(ver);
        }
        if(Character.isLetterOrDigit(c)){
            stack.push(c+"");
        }

       }
       System.out.println(stack.pop());


    }
    public static void main(String[] args) {
        String s="*+ab-cd";
        pref(s);
    }
    
}
