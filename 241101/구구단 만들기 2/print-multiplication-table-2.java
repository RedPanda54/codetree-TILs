import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = 2; i <= 8; i += 2) {
            for (int j = b; j >= a; j--) {
                System.out.printf("%d * %d = %d", j, i, i * j);
                if (j != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}