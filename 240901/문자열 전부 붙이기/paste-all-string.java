import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String result = "";
        for (int i = 0; i < n; i++) {
            result += input.next();
        }
        
        System.out.print(result);
        input.close();
    }
}