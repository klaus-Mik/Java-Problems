public class numbersinverted {
    public static void main(String[] args){
        int rows=5;
        for(int i=rows;i>=0;i--){
            int n=0;
            for(int j=i;j>0;j--){           
                System.out.print(n+1);
                n=n+1;
            }
            System.out.println();
        }
    }
}
