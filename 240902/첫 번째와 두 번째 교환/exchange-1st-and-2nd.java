import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char first = str.charAt(0);
        char second = str.charAt(1);

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == first)
                result += second;
            else if (str.charAt(i) == second)
                result += first;
            else
                result += str.charAt(i);
        }
        
        System.out.print(result);

        input.close();
    }
}