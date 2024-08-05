import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                count++;
            }
        }

        System.out.print(count);
    }
}