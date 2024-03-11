import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean satisfied = false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                satisfied = true;
            }
        }

        if (satisfied) {
            System.out.print("C");
        } else {
            System.out.print("N");
        }
    }
}