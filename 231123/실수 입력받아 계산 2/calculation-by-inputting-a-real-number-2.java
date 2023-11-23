import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double result = a+1.5;
        System.out.prinf("%.1f", result);
    }
}