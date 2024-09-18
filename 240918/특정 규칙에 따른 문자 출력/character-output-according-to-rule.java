import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        input.close();
    }
}