package linkedList;

public class reverse {
    void Reverse(linkedlist s){
        Node x=s.head;
        Node prev=null;
        Node n;
        while(x!=null){
            n=x.next;
            x.next=prev;
            prev=x;
            x=n;
        }
        s.head=prev;
        
    }
    void printt(linkedlist s){
        Node l=s.head;
        while(l!=null){
            System.out.print(l.data +"->");
            l=l.next;
        }
        System.out.print("null");
        
    }
     void recursive(Node s){
        if(s==null){
            return;
        }
        recursive(s.next);
        System.out.print(s.data+"->");
       
     }

     
    public static void main(String[] args){
        linkedlist s= new linkedlist();
        s.insert(5);
        s.insert(4);
        s.insert(3);
        s.insert(2);
        s.insert(1);
        s.insert(1);

        reverse z= new reverse();
        z.recursive(s.head);
        System.out.println();
        z.Reverse(s);
        z.printt(s);
    }
}
