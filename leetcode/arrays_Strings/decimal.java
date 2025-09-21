public class decimal {
    public static int bi(int x){
        int s=0;
        int l=0;
        while(x>0){
            int rem=x%2;
            
            s+=rem*Math.pow(10,l);
            l++;
            x=x/2;
        }
        return s;

    }
    public static void main(String[] args){
        int x=23;
        System.out.println(bi(x));
    }
}
