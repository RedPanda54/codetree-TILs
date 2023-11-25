import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        int minus = a-b;
        double result = sum/minus;
        System.out.printf("%.2f", result);
    }
}