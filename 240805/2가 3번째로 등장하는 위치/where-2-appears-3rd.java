import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int result = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2)
                count++;
            if (count == 3) {
                result = i + 1;
                break;
            }
        }
        
        System.out.print(result);
    }
}