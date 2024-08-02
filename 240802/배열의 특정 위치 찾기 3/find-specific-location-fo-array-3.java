import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0;
        int i = 0;
        while (true) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
            i++;
        }
        System.out.print(arr[i - 1] + arr[i - 2] + arr[i - 3]);
    }
}