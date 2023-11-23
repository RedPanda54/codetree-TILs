import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double result = n*30.48;
        System.out.printf("%.2f", result);
    }
}