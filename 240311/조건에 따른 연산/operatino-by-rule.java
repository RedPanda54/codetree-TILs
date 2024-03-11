import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;

        while (n < 1000) {
            if (n % 2 == 0) {
                n = 3 * n + 1;
                count++;
            } else {
                n = 2 * n + 2;
                count++;
            }
        }

        System.out.print(count);
    }
}