import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int a = 0;

        for (int i = 1; i <= 100; i++) {
            if (sum >= n) {
                a = i-1;
                break;
            }
            sum += i;
        }

        System.out.print(a);
    }
}