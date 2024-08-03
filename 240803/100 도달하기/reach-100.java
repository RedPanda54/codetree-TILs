import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;

        System.out.print(arr[0] + " " + arr[1] + " ");
        
        for (int i=2; i<100; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if (arr[i] >= 100) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}