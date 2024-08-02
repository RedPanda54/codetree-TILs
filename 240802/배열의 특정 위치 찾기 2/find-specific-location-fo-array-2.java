import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (i % 2 != 0) {
                odd += arr[i];
            }
            else {
                even += arr[i];
            }
        }
        int result = odd > even ? (odd - even) : (even - odd);
        System.out.print(result);
    }
}