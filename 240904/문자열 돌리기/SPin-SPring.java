import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len = str.length();

        System.out.println(str);
        for (int i = 0; i < len; i++) {
            str = str.substring(len - 1, len) + str.substring(0, len - 1);
            System.out.println(str);
        }

        input.close();
    }
}