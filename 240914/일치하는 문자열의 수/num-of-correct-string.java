import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String A = input.next();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A.equals(input.next())) count++;
        }
        
        System.out.print(count);

        input.close();
    }
}