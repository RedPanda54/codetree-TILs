import java.util.*;

public class Main {
    public static boolean isUpper(char x) {
        if ('A' <= x && x <= 'Z')
            return true;
        return false;
    }

    public static boolean isLower(char x) {
        if ('a' <= x && x <= 'z')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len = str.length();

        String result = "";
        for (int i = 0; i < len; i++) {
            char temp = str.charAt(i);
            if ('A' <= temp && temp <= 'z') {
                if (isUpper(temp))
                    result += temp;
                else if (isLower(temp))
                    result += (char) (temp - 'a' + 'A');
            }
        }
        
        System.out.print(result);

        input.close();
    }
}