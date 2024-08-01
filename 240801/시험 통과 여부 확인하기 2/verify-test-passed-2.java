import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int sum = 0;
        double average = 0.0;
        int sub;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                sub = input.nextInt();
                sum += sub;
            }
            average = (double) sum / 4;
            
            if (average >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
            
            sum = 0;
        }
        System.out.println(count);
    }
}