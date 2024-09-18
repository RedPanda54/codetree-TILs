import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[200];

        int index = -1;
        for (int i = 0; i < 200; i++) {
            String str = input.next();
            if (str.charAt(0) == '0')
                break;
            arr[i] = str;
            index = i;
        }

        if (index != -1) {
            System.out.println(index + 1);
            for (int i = 0; i <= index; i += 2) {
                System.out.println(arr[i]);
            }
        }

        input.close();
    }
}