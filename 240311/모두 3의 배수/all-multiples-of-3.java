import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        
        if (a%3 == 0 && b%3 == 0 && c%3 == 0 && d%3 == 0 && e%3 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}