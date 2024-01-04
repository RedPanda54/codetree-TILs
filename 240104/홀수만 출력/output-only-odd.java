import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}