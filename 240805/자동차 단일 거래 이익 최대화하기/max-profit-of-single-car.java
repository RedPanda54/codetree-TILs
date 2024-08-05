import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int a;
        int result = 0;
        for (int i=0; i<n; i++) {
            a = arr[i];

            for (int j=i+1; j<n; j++) {
                if (result < arr[j] - a) {
                    result = arr[j] - a;
                }
            }
        }

        System.out.print(result);
    }
}