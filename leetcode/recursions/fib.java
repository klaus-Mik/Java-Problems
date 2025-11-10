package recursions;

public class fib {
    static int fibonnaci(int n){
        if(n<=1){
          return n;
        }
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonnaci(n));   

    }
}
