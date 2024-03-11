import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                satisfied = true;
                break;
            } else {
                satisfied = false;
            }
        }

        if (satisfied) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
}