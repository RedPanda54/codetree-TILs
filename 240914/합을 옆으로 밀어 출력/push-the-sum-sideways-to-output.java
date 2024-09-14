import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        
        String str = Integer.toString(sum);
        str = str.substring(1) + str.substring(0, 1);
        
        System.out.print(str);

        input.close();
    }
}