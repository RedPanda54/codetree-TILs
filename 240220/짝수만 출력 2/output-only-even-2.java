import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (a >= b) {
            System.out.print(a + " ");
            a = a-2;
        }
    }
}