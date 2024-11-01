import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j -= 2) {
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