package recursions;

public class subset {
    static void subsee(int[] arr,int i, int sum){
        if(i==arr.length){
            System.out.println(sum);
            return;
        }
        subsee(arr, i+1, sum+arr[i]);
        subsee(arr, i+1, sum);

    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        subsee(arr, 0, 0);     
    }
}
