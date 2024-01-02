import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        

        if (a > b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if (a > c) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if (a > d) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        if (a > e) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}