import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a%2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        if (b%2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}