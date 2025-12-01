package stack_queue;
import java.util.*;

import java.util.ArrayList;

public class postfix {
    static void pref(String s){
       Stack<String> stack= new Stack<>();

       
       for(int i=0;i<s.length();i++){
        char c= s.charAt(i);
        if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
            String opr2=stack.pop();
            String opr1=stack.pop();
            String ver=c+opr1+opr2;
            stack.push(ver);
        }
        if(Character.isLetterOrDigit(c)){
            stack.push(c+"");
        }

       }
       System.out.println(stack.pop());


    }
    public static void main(String[] args) {
        String s="ab+cd-*";
        pref(s);
    }
    
}
