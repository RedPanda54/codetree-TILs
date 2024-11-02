import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char cnt = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(cnt);
                cnt++;
                if (cnt == '[') {
                    cnt = 'A';
                }
            }
            System.out.println();
        }

        input.close();
    }
}