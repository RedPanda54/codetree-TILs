import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        
        int n = input.nextInt();
        
        for (int i=0; i<n; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i] * arr[i];
        }
        
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}