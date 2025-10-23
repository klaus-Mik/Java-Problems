package linkedList;

import java.util.*;

public class middle {
    void Middle( linkedlist s){
        Node slow=s.head,fast=s.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }
    public static void main(String[] args){
        linkedlist s= new linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            s.insert(x);
        }
        middle m= new middle();
        m.Middle(s);
        
    }
}

/*
 * Creating a new linkedlist object using "linkedlist" class from another class ;
 * adding elemnts through it , to access the fuinctions in this class create a 
 * new object with this class and access the methods using it and passing the object 
 * that is the linked list created from another class as paramter , we cant directly
 * use the current class method by creating an object from another class , so do it 
 * this way ; head and properties of lionked list belong to another class
 * and are not local to current class so use "." to access them ;
 * 
 */
