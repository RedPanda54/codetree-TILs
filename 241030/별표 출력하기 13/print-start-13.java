import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 1) {
                for (int k = 0; k < 1 + i / 2; k++)
                    System.out.print("* ");
            } else {
                for (int k = 0; k < n - i / 2; k++)
                    System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}