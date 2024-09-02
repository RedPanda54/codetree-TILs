import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();

        int count = 0;
        for (int i = 0; i <= A.length() - B.length(); i++) {
            if (A.substring(i, i + B.length()).equals(B)) {
                count++;
            }
        }

        System.out.print(count);
        
        input.close();
    }
}