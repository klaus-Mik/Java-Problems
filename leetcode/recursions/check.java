package recursions;

public class check {
    static boolean checkk(int[] arr, int k, int present,int i){
        if(present==k){
            return true;
        }
        if(i==arr.length){
            return false;
        }
        if(
        checkk(arr, k, present+arr[i], i+1)){
            return true;
        }
        if(checkk(arr, k, present+arr[i], i+1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(checkk(arr, 10, 0, 0)
        );
    }
}
