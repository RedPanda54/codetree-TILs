import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = n;
        int b = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
                a -= 1;
                System.out.println();
            }
            else {
                for (int j = 0; j < b; j++) {
                    System.out.print("* ");
                }
                b += 1;
                System.out.println();
            }
        }

        a += 1;
        b -= 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
                a += 1;
                System.out.println();
            }
            else {
                for (int j = 0; j < b; j++) {
                    System.out.print("* ");
                }
                b -= 1;
                System.out.println();
            }
        }
        input.close();
    }
}