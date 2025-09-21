public class sum {
    public static int som(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x=x/10;
        }
        return s;
    }
    public static void main(String[] args){
        int x=333;
        System.out.println(som(x));
    }   
}
