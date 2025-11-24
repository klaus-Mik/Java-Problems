package stack_queue;
import java.util.*;
public class queue{
   public static void main(String[] args) {
    Queue<Integer> q=new ArrayDeque<>();
    q.offer(3);
   
    q.offer(4);
    System.out.println(q);
   }
}