import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 5) {
            System.out.println("A");
        }
        else if (a%2 == 0) {
            System.out.println("B");
        }
    }
}