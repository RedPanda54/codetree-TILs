import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        
        while (n != 1) {
            n /= 2;
            x++;
        }
        
        System.out.print(x);
    }
}