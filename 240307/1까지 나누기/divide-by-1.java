import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double quotient = 1.0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                quotient = (double) (n / i);
            } else {
                quotient = (double) (quotient / i);   
            }
            count++;
            
            if (quotient <= 1) {
                break;
            }
        }

        System.out.print(count);
    }
}