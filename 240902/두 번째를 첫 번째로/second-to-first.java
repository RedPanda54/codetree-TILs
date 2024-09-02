import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char a = str.charAt(0);
        char b = str.charAt(1);

        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (result.charAt(i) == b) {
                result.setCharAt(i, a);
            }
        }
        
        System.out.print(result.toString());

        input.close();
    }
}