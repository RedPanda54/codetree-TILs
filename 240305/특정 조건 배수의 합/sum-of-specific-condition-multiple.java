import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        //int cnt = 0;
        int sum = 0;
        //double average = 0.0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    //cnt++;
                    sum += i;
                }
            }
        } else if (a > b) {
            for (int i = b; i >= a; i--) {
                if (i % 5 == 0) {
                    //cnt++;
                    sum += i;
                }
            }
        } else {
            if (a % 5 == 0) {
                sum += a;
            }
        }

        //average = (double) sum / cnt;

        System.out.print(sum);
        //System.out.printf("%.1f", average);
    }
}