import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }
    }
}