import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++)
            arr[i] = input.next();

        char alphbat = input.next().charAt(0);

        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == alphbat)
                System.out.println(arr[i]);
            else 
                System.out.println("None");
        }

        input.close();
    }
}