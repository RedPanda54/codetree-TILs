import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(str.charAt(i));   
            }
        }

        input.close();
    }
}