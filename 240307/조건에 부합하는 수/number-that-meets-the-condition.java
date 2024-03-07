import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            if ((i % 2 == 0 && i % 4 != 0) || (i / 8) % 2 == 0 || (i % 7) < 4) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}