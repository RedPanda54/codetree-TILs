import java.util.*;

public class Main {
    public static boolean isInteger(char x) {
        if ('0' <= x && x <= '9')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len = str.length();
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            if (isInteger(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }
        }
        
        System.out.print(sum);

        input.close();
    }
}