import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = 1;

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            temp = 1;
            
            for (int j = a; j <= b; j++) {
                temp *= j;
            }
            System.out.println(temp);
        }
        input.close();
    }
}