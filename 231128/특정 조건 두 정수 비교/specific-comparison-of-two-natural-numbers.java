import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a < b) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

        System.out.print(" ");

        if (a == b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}