import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if ((a%2 == 1 && a%3 == 0) || (a%2 == 0 && a%5 == 0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}