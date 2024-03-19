import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();
            sum += n;
        }
        System.out.print(sum);
    }
}