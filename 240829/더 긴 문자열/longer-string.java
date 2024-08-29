import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        if (str1.length() > str2.length()) {
            System.out.println(str1 + " " + str1.length());
        } else if (str1.length() < str2.length()) {
            System.out.println(str2 + " " + str2.length());
        } else {
            System.out.println("same");
        }

        input.close();
    }
}