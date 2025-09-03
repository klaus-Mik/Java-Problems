public class buyStock {
    public static void best(int[] arr){
        int profit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int present=arr[j]-arr[i];
                if(present>profit){
                    profit=present;
                }
            }
        }
        System.out.println(profit);
    }
    public static void main(String[] args){
        int[] arr={7,6,4,3,1};
        best(arr);

    }
}
