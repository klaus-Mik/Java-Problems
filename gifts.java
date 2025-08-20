import java.util.*;

public class gifts {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        int[] count = new int[n + 1];  // index 1..n

        // Count gifts received by each member
        for (int i = 0; i < m; i++) {
            count[gifts[i][1]]++;
        }

        int young = -1;
        // Find the one who received from everyone else (n-1 gifts)
        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                young = i;
            }
        }

        System.out.println(young);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // number of members
        int m = scanner.nextInt();  // number of gift exchanges
        int[][] gifts = new int[m][2];

        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();  // giver
            gifts[i][1] = scanner.nextInt();  // receiver
        }

        find_youngest_member(n, m, gifts);
    }
}
