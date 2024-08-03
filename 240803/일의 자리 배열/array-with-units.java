import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 2; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            arr[i] %= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}