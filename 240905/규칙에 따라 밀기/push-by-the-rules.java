import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String command = input.next();

        int len = command.length();
        for (int i = 0; i < len; i++) {
            if (command.charAt(i) == 'L') {
                A = A.substring(1, A.length()) + A.substring(0, 1);
            } else {
                A = A.substring(A.length() - 1, A.length()) + A.substring(0, A.length() - 1);
            }
        }
        
        System.out.print(A);
        input.close();
    }
}