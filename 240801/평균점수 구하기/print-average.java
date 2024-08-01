import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

        double[] arr = new double[8];
        double average = 0.0;

        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextDouble();
            average += arr[i];
        }
        average /= 8;
        System.out.printf("%.1f\n", average);
        
    }
}