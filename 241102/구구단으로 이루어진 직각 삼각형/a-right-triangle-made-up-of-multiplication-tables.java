import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if (j == n - i + 1) {
                    System.out.printf("%d * %d = %d\n", i, j, (i * j));
                }
                else {
                    System.out.printf("%d * %d = %d / ", i, j, (i * j));
                }
            }
        }

        input.close();
    }
}