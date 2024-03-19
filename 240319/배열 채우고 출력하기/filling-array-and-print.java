import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            arr[i] = input.next();
        }
        for (int i = 9; i >= 0; i--) {
            result.append(arr[i]);
        }
        System.out.print(result);
    }
}