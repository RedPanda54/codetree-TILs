import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (n > 1) {
            n /= i;
            i++;
        }
        System.out.print(i - 1);

        input.close();
    }
}