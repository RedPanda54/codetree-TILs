import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;

        while (n > 0) {
            result += (n % 10);
            n /= 10;
        }

        System.out.println(result);

        input.close();
    }
}