import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a >= 3 && a < 6) {
            System.out.println("Spring");
        }
        else if (a >= 6 && a < 9) {
            System.out.println("Summer");
        }
        else if (a >= 10 && a < 13) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
    }
}