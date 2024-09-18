import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        int len = a.length();
        int n = 0;

        if (b.length() != len) {
            System.out.println("-1");
            System.exit(0);
        } else {
            for (int i = 0; i < len; i++) {
                if (a.equals(b)) {
                    System.out.println(n);
                    break;
                }
                a = a.substring(len - 1) + a.substring(0, len - 1);
                n++;
            }

            if (n == len) {
                System.out.println("-1");
            }
        }

        input.close();
    }
}