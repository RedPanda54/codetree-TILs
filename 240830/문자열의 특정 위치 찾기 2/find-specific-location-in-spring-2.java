import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        char a = input.next().charAt(0);
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == a || arr[i].charAt(3) == a) {
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println(count);
        input.close();
    }
}