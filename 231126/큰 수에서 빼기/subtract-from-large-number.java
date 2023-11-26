import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = int.nextInt();
        int b = int.nextInt();

        if (a > b) {
            System.out.println(a-b);
        }
        else if (a < b) {
            System.out.println(b-a);
        }
    }
}