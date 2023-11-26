import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        if (a < 0) {
            System.out.println("minus");
        }
    }
}