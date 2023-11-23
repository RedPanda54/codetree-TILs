import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.printf("%.3f", a);
        System.out.println();
        System.out.printf("%.3f", b);
        System.out.println();
        System.out.printf("%.3f", c);
    }
}