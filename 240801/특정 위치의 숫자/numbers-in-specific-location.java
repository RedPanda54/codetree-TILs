import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print(arr[2] + arr[4] + arr[9]);
    }
}