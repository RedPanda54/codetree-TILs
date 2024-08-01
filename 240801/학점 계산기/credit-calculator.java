import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double[] arr = new double[n];
        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
            sum += arr[i];
        }
        average = sum / n;
        System.out.printf("%.1f\n", average);
        if (average >= 4.0) {
            System.out.println("Perfect");
        } else if (average >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}