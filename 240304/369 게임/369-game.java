import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(0 + " ");
                continue;
            } else if ((i % 10) == 3) {
                System.out.print(0 + " ");
                continue;
            } else if ((i % 10) == 6) {
                System.out.print(0 + " ");
                continue;
            } else if ((i % 10) == 9) {
                System.out.print(0 + " ");
                continue;
            } else if ((i / 10) == 3) {
                System.out.print(0 + " ");
                continue;
            } else if ((i / 10) == 6) {
                System.out.print(0 + " ");
                continue;
            } else if ((i / 10) == 9) {
                System.out.print(0 + " ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}