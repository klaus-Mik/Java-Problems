package patterns;

public class hollowrectangle {
    int rows=4;
    int cols=5;
    for(int i=0;i<rows-1;i++){
        for(int j=0;j<cols-1;j++){
            if(i==0 || i==rows-1 || j==0 || j==cols-1){
                System.out.println("*");
            }
            else{
                System.out.println(" ");
            }
        }
    }
}
