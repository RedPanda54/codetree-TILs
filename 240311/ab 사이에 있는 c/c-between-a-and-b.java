import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                satisfied = true;
            }
        }
        
        if (satisfied == true) {
            System.out.print("YES");
        } else {
            System.out.print("No");
        }
    }
}