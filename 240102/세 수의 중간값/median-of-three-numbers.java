import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if (a >= b && a <= c) {
            System.out.println(a);
        } else if (a >= c && a <= b) {
            System.out.println(a);
        } else if (b >= a && b <= c) {
            System.out.println(b);
        } else if (b >= c && b <= a) {
            System.out.println(b);
        } else if (c >= a && c <= b) {
            System.out.println(c);
        } else {
            System.out.println(c);
        }
    }
}