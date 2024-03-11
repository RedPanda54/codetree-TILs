import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean satisfied = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                satisfied = false;
                break;
            }
        }
        
        if (satisfied) {
            System.out.println("P");   
        } else {
            System.out.println("C");
        }
    }
}