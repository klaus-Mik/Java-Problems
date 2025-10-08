import java.util.Arrays;

public class cookie {
    public static int satisy(int[] cookies, int[] childs){
        Arrays.sort(cookies);
        Arrays.sort(childs);
        int count=0;
        int i=0;
        int j=0;
        while(i<childs.length && j<cookies.length){
            if(cookies[j]>=childs[i]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
