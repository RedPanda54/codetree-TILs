import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}