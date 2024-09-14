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
        String int1 = "";
        String int2 = "";

        int i = 0;
        char temp1 = str1.charAt(i);
        while (isInteger(temp1)) {
            int1 += temp1;
            temp1 = str1.charAt(++i);
        }
        int result1 = Integer.parseInt(int1);

        i = 0;
        char temp2 = str2.charAt(i);
        while (isInteger(temp2)) {
            int2 += temp2;
            temp2 = str2.charAt(++i);
        }
        int result2 = Integer.parseInt(int2);

        System.out.println(result1 + result2);
        
        input.close();
    }
}