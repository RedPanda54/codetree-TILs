import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(j + 1);
                }
            }
            else {
                for (int j = 0; j < n; j++) {
                    System.out.print(n - j);
                }
            }
            System.out.println();
        }

        input.close();
    }
}