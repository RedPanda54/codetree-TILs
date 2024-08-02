import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                temp = i;
                break;
            }
        }

        System.out.print(arr[temp - 1] + arr[temp - 2] + arr[temp - 3]);
    }
}