public class rightrev {
    public static void main(String[] args){
        int rows=4;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                   
            }
            System.out.println();
        }
    }
}
