package linkedList;

public class seperate {
    void sep(linkedlist s){
        Node Evenstart=null;
        Node EvenEnd=null;
        Node Oddstart=null;
        Node Oddend=null;
        Node m=s.head;
        while(m!=null){
            int c=m.data;
            if(c%2==0){
                if(Evenstart==null){
                    Evenstart=m;
                    EvenEnd=Evenstart;       
                }else{
                    EvenEnd.next = m;
                    EvenEnd = EvenEnd.next;
                    
                }  
                
            }else{
                if(Oddstart==null){
                    Oddstart=m;
                    Oddend=Oddstart;
                }else{
                    Oddend.next=m;
                    Oddend=Oddend.next;
                }
                
            }
            m=m.next;

        }
        if(Evenstart==null || Oddstart==null){
            return;
        }
        EvenEnd.next=Oddstart;
        Oddend.next=null;
        s.head=Evenstart;
        Node t=s.head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        linkedlist s= new linkedlist();
        s.insert(4);
        s.insert(3);
        s.insert(2);
        s.insert(1);
        s.insert(6);
        s.insert(5);
        s.insert(7);
        seperate m= new seperate();
        m.sep(s);
    }
}
