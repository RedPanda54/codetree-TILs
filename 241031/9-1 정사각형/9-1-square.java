import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cnt);
                cnt--;
                if (cnt < 1) {
                    cnt = 9;
                }
            }
            System.out.println();
        }

        input.close();
    }
}