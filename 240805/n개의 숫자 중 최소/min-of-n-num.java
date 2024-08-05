import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        // int 타입의 최대값 표현.
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == minValue)
                count++;
        }
        
        System.out.print(minValue + " " + count);
    }
}