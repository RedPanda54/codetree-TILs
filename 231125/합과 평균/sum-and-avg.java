import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        double average = ((double)sum)/2;
        System.out.printf(sum + " " + "%.1f", average);
    }
}