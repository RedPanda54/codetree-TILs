import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                cnt3++;
                continue;
            } else if (i % 3 == 0) {
                cnt2++;
                continue;
            } else if (i % 2 == 0) {
                cnt1++;
                continue;
            }
        }

        System.out.print(cnt1 + " " + cnt2 + " " + cnt3);
    }
}