import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%2 == 1) {
            a += 3;
        }
        if (a%3 == 0) {
            a /= 3;
        }

        System.out.println(a);
    }
}