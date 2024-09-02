import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char first = str.charAt(0);
        char second = str.charAt(1);

        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < result.length(); i++) {
            if (str.charAt(i) == first)
                result.setCharAt(i, second);
            else if (str.charAt(i) == second)
                result.setCharAt(i, first);
            else 
                result.setCharAt(i, str.charAt(i));
        }

        System.out.println(result.toString());


        input.close();
    }
}