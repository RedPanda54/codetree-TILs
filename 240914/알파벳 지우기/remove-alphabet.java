import java.util.*;

public class Main {
    public static boolean isInteger(char a) {
        if ('0' <= a && a <= '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        String temp1 = "";
        String temp2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (isInteger(str1.charAt(i))) {
                temp1 += str1.charAt(i);
            } else {
                continue;
            }
        }
        int a = Integer.parseInt(temp1);

        for (int i = 0; i < str2.length(); i++) {
            if (isInteger(str2.charAt(i))) {
                temp2 += str2.charAt(i);
            } else {
                continue;
            }
        }
        int b = Integer.parseInt(temp2);

        System.out.print(a + b);
        
        input.close();
    }
}