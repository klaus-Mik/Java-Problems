package linkedList;

public class linkedpalin {
    void palin(linkedlist s){
        Node t=s.head;
        pal(t);
    }
    void pal(Node s){
        if(s==null) return;
        pal(s.next);
        System.out.println(s.data);
        linkedlist j= new linkedlist();
        j.insert(s.data);
        System.out.println(j);
      
    }
    public static void main(String[] args) {
        linkedlist s= new linkedlist();
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(2);
        s.insert(4);
        linkedpalin m= new linkedpalin();
        m.palin(s);
    }
}
