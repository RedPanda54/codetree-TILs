import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int minimum;
        
        if (a >= b) {
            minimum = b;
        }
        else {
            minimum = a;
        }
        
        if (minimum >= c) {
            minimum = c;
        }
        
        System.out.println(minimum);
    }
}