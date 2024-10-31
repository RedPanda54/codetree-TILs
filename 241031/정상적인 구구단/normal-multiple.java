import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.printf("%d * %d = %d", i, j, i * j);
                } else {
                    System.out.printf("%d * %d = %d, ", i, j, i * j);
                }
            }
            System.out.println();
        }

        input.close();
    }
}