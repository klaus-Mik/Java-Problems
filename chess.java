import java.util.Scanner;

public class chess {
    public static String determineColor(String s) {
        char a = s.charAt(0);
        char b = s.charAt(1);

        int c = a - 'a' + 1; // column
        int d = b - '0';     // row

        if ((c + d) % 2 == 0) {
            return "Black";
        } else {
            return "White";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
