import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double quotient = n;
        int count = 0;

        for (int i = 1; i <= quotient; i++) {
            quotient = (double) (quotient / i);
            count++;

            if (quotient <= 1) {
                System.out.print(count);
                break;
            }
        }
    }
}