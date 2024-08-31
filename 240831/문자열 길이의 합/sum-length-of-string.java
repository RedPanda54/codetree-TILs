import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int total_length = 0;
        int count = 0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
            total_length += arr[i].length();
            if (arr[i].charAt(0) == 'a') count++;
        }

        System.out.print(total_length + " " +count);
        
        input.close();
    }
}