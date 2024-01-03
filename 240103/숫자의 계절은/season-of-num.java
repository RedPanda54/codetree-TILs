import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a >= 3 && a < 6) {
            System.out.println("Spring");
        }
        if (a >= 6 && a < 9) {
            System.out.println("Summer");
        }
        if (a >= 10 && a < 13) {
            System.out.println("Fall");
        }
        if ((a >= 1 && a < 3) || a == 12) {
            System.out.println("Winter");
        }
    }
}