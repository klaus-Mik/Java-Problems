package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){             
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={2,3,1,6,5};
        sort(arr);

    }
}
