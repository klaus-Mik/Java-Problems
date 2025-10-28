package linkedList;

public class remonrNth {
    void remove(linkedlist s,int n){
        Node slow=s.head,fast=s.head;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;       
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
           
        
        Node temp=s.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        linkedlist s=new linkedlist();
        s.insert(4);
        s.insert(2);
        s.insert(1);
        s.insert(5);
        s.insert(46);
        s.insert(49);
        s.insert(44);
        remonrNth j= new remonrNth();
        j.remove(s, 2);
    }
}
