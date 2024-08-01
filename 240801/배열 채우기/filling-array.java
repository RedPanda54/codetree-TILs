import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int[] arr = new int[10];
        int savepoint = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
            savepoint = i;
        }
        
        for (int i = savepoint; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}