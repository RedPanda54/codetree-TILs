import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = input.nextInt();

        Arrays.sort(arr);
        
        int maxValue = arr[0];
        int minValue = arr[9];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > maxValue && arr[i] < 500) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue && arr[i] > 500) {
                minValue = arr[i];
            }
        }
        
        System.out.print(maxValue + " " + minValue);
    }
}