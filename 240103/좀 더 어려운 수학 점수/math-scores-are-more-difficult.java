import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();

        if (a1 > b1) {
            System.out.println("A");
        }
        else if (a1 < b1) {
            System.out.println("B");
        }
        else {
            if (a2 > b2) {
                System.out.println("A");
            }
            else if (a2 < b2) {
                System.out.println("B");
            }
        }
    }
}