import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a <= b && a <= c)
            System.out.print("1 ");
        else
            System.out.print("0 ");

        if(a == b && b == c)
            System.out.println("1");
        else
            System.out.println("0");
    }
}