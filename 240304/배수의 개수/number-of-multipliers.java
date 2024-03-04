import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int three = 0;
        int five = 0;

        for (int i = 0; i < 10; i++) {
            int a = input.nextInt();
            if (a % 3 == 0) {
                three++;
            } 
            if (a % 5 == 0) {
                five++;
            }
        }

        System.out.print(three + " " + five);
    }
}