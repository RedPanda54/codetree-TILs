import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int[] arr = new int[10];
        int n = 0;
        int sum = 0;
        double average = 0.0;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
            sum += arr[i];
            n++;
        }
        average = (double) sum / n;
        
        System.out.printf("%d %.1f", sum, average);
    }
}