import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        double average = 0.0;
        
        for (int i=0; i<n; i++) {
            int a = input.nextInt();
            sum += a;
        }
        
        average = (double) sum / n;
        System.out.printf("%d %.1f", sum, average);
    }
}