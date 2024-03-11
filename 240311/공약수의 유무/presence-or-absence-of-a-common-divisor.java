import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int common_factor = 960;
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (common_factor % i == 0) {
                satisfied = true;
            }
        }

        if (satisfied) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}