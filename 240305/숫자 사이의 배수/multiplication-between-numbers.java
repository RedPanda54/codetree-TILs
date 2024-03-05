import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int cnt = 0;
        int sum = 0;
        double average = 0.0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                cnt++;
                sum += i;
            }
        }
        average = (double) sum / cnt;

        System.out.print(sum + " ");
        System.out.printf("%.1f", average);
    }
}