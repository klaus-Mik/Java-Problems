public class palindrome {
    public static void pali(int x){
        int s=0;
        int q=x;
        
        while(x>0){
            int r=x%10;
            s=s*10+r;
            x=x/10;
            
        }
        System.out.println(s);
        if(s==q){
            System.out.println("palindrome");

        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args){
        int x=333;
        pali(x);
    }
    
}
