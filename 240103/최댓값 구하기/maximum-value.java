import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        
        if (a <= b) {
            if (b <= c) {
                max = c;
            }
            else {
                max = b;
            }
        }
        else {
            if (a <= c) {
                max = c;
            }
            else {
                max = a;
            }
        }
        
        System.out.println(max);
    }
}