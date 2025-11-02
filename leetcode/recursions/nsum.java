package recursions;

public class nsum {
    public static int sum(int n, int d){
        if(n==d){
            return n;
        }
        return n+ sum(n+1,d);

    }
    public static void main(String[] args) {
        int n=7;
       
        System.out.println(sum(0, n));

}}
