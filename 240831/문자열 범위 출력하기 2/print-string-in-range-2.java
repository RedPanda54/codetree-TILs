import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();
        if (n >= str.length()) {
            for (int i = str.length() - 1; i >= 0; i--)
                System.out.print(str.charAt(i));
        }
        else { // n < str.length()
            for (int i = str.length() - 1; i >= str.length() - n; i--)
                System.out.print(str.charAt(i));
        }

        input.close();
    }
}