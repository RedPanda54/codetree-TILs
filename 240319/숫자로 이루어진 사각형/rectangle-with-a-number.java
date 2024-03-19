import java.util.*;

public class Main {
    public static void rectangle(int n) {
        int value = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                value++;
                if (value > 9) {
                    value = 1;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        rectangle(n);
    }
}