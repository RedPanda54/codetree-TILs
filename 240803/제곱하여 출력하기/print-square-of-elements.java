import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = input.nextInt();
            arr[i] = (int) Math.pow(arr[i], 2);
        }

        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}