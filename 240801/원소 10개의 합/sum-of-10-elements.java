import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value, sum;
        sum = 0;
        for (int i = 0; i < 10; i++) {
            value = input.nextInt();
            sum += value;
        }

        System.out.print(sum);
    }
}