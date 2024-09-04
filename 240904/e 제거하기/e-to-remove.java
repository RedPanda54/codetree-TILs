import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                str = str.substring(0, i) + str.substring(i + 1);
                break;
            }
        }
        
        System.out.print(str);

        input.close();
    }
}