import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        int result = 200;
        int a;
        int b;
        for (int i = 0; i < n - 1; i++) {
            a = arr[i];
            b = arr[i + 1];
            if (result > b - a) {
                result = b - a;
            }

        }

        System.out.print(result);
    }
}