
import java.util.*;

import java.util.ArrayList;

public class merge {
    public static void mergesorted(int[] a, int[] b){
        List<Integer> arrays=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arrays.add(a[i]);
                i++;
            }
            else{
                arrays.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            arrays.add(a[i]);
            i++;
        }
        while(j<b.length){
            arrays.add(b[j]);
            j++;
        }
       
        System.out.println(arrays);

    }

    public static void main(String[] args){
        int[] a={1,2,6,7,9};
        int[] b={0,1,2,3,4,5};
        mergesorted(a, b);
    }
    
}
