import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[11];

        int i = 0;
        int count = 0;
        while (count != 2) {
            arr[i] = n * (i + 1);
            if (arr[i] % 5 == 0)
                count++;
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}