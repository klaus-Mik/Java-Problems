package doublelinked;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class doublelinkedlist{
    Node head;

    void insert(int data){
        Node m= new Node(data);
        if(head==null){
            head=m;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=m;
        m.prev=temp;
    }
    void delete(int k){
        Node temp=head;
        if(temp.data==k){
            head=temp.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        while(temp!=null && temp.data!=k){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.prev.next=null;
        }
        temp.next.prev=temp.next;
        temp.prev.next=temp.prev;
    }
}