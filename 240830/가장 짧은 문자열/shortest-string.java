import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int maximum = Math.max(len1, len2);
        maximum = Math.max(maximum, len3);

        int minimum = Math.min(len1, len2);
        minimum = Math.min(minimum, len3);

        System.out.print(maximum - minimum);

        input.close();
    }
}