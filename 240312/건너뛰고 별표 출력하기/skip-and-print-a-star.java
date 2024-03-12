import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i < n + 1; i++) {          // i는 0부터 2까지 돌면 됩니다.
            for (int j = 0; j < i; j++) {  // j는 0부터 2 - i까지 돌면 됩니다.
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {          // i는 0부터 2까지 돌면 됩니다.
            for (int j = 0; j < i; j++) {  // j는 0부터 2 - i까지 돌면 됩니다.
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}