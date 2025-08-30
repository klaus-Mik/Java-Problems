public class rmeoveDuplicates2 {
    import java.util.*;

public class removeDuplicates {
    public static void remove(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!seen.contains(arr[i])) {
                arr[k] = arr[i];   // keep unique element at index k
                seen.add(arr[i]);  // record that we’ve seen it
                k++;
            }
        }

        // Print only the unique elements (from 0 to k)
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 6, 6, 7};
        remove(arr);
    }
}

}
