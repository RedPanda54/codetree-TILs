import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a%3 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        if (a%5 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}