import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[4];
        
        for (int i=0; i<4; i++) {
            String str = input.next();
            arr[i] = str;
        }
        
        for (int i=3; i>=0; i--) {
            System.out.println(arr[i]);
        }
        
        input.close();
    }
}