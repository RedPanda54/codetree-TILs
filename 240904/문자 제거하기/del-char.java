import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        while (str.length() != 1) {
            int n = input.nextInt();
            if (n >= str.length()) n = str.length() - 1;
            str = str.substring(0, n) + str.substring(n + 1);
            System.out.println(str);
        }

        input.close();
    }
}