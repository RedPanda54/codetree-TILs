import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int maxValue = 0;
        for (int i=0; i<10; i++) {
            a = input.nextInt();
            if (a > maxValue) {
                maxValue = a;
            }
        }
        
        System.out.print(maxValue);
    }
}