import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        input.close();
    }
}