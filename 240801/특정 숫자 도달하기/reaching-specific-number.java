import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        int count = 0;
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 250) {
                break;
            }
            count++;
            sum += arr[i];
        }
        average = (double) sum / count;

        System.out.printf("%d %.1f", sum, average);
    }
}