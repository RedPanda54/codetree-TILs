import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);

        if (a == minimum) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

        if (a == b) {
            if (a == c) {
                System.out.print(1);
            }
            System.out.println(0);
        }
        else {
            System.out.print(0);
        }
    }
}