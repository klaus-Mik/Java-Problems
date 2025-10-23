package linkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedlist {
    Node head;

   void insert(int data){
    Node n=new Node(data);
    if(head==null){
        head=n;
        return;
    }
    Node temp=head;

    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=n;
   }

    void delete(int k){
        Node temp=head , prev=null;
        if(temp.next!=null && temp.data==k){
            head=temp.next;
        }
        while(temp.next!=null && temp.data!=k){
            prev=temp;
            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        prev.next=temp.next;
    }

    void length(){
        int leng=0;
        Node temp=head;
        while(temp!=null){
            leng++;
            temp=temp.next;
          
        }
        System.out.println(leng);
    }

    void search(int k){
        Node temp=head;
        int indexx=0;
        boolean present=false;
        while(temp!=null){
            if(temp.data==k){
                System.out.println(indexx);
                present=true;
            }
            indexx++;
            temp=temp.next;
        }
        if(!present){
            System.out.println(present);
        }
    }

  
}
