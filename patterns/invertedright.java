public class invertedright {
    public static void main(String[] args){
        int rows=4;
        for(int i=rows-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
