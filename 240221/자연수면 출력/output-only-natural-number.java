import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0) {
            for (int i=0; i<b; i++) {
                System.out.print(a);
            }
        }
        else {
            System.out.print(0);
        }
    }
}