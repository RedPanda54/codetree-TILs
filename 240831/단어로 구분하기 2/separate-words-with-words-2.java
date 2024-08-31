import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i=0; i<10; i++) {
            arr[i] = input.next();
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        input.close();
    }
}