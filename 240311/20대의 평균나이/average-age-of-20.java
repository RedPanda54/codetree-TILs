import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        int count = 0;
        int sum = 0;
        double average;

        while (true) {
            age = input.nextInt();

            if (age / 10 == 2) {
                sum += age;
                count++;
            } else {
                average = (double) sum / count;
                System.out.printf("%.2f", average);
                break;
            }
        }
    }
}