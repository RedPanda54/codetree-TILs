import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double quotient = n;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            quotient /= i;
            count++;
            //System.out.println(quotient);

            if (quotient <= 1) {
                break;
            }
        }

        System.out.print(count);
    }
}