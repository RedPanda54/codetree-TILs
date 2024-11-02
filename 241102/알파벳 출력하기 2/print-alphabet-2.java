import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char cnt = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(cnt + " ");
                    cnt++;
                    if (cnt > 'Z') {
                        cnt = 'A';
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}