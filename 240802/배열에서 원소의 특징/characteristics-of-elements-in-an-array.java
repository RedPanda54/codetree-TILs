import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (arr[i] % 3 == 0) {
                break;
            }
        }
        System.out.print(arr[i - 1]);
    }
}