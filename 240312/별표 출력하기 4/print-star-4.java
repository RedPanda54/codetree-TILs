import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {          // i는 0부터 2까지 돌면 됩니다.
            for (int j = 0; j < n - i; j++) {  // j는 0부터 2 - i까지 돌면 됩니다.
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {             // i는 1부터 0까지 1씩 감소하면 됩니다.
            for (int j = 0; j < i + 1; j++) {     // j는 0부터 2 - i까지 돌면 됩니다.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}