import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = new char[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (char) input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }
}