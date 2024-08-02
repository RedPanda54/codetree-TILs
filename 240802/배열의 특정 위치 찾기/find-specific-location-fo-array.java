import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 1; i < 10; i += 2) {
            sum += arr[i];
        }
        average = (double) (arr[2] + arr[5] + arr[8]) / 3;
        
        System.out.printf("%d %.1f", sum, average);
    }
}