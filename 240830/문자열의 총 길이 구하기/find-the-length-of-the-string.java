import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];

        int total = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = input.next();
            total += arr[i].length();
        }
        
        System.out.println(total);

        input.close();
    }
}