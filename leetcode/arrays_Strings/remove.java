

public class remove {
    public static int lengthh(int[] a, int val){
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[k]=a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] a={1,1,2,3,4,5,6,7,1};
        int val=1;
        System.out.println(lengthh(a, val));
    }
}
