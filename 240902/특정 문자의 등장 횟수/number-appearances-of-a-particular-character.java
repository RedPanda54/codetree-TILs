import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("ee"))
                cnt1++;
            else if (str.substring(i, i + 2).equals("eb"))
                cnt2++;
        }

        System.out.print(cnt1 + " " + cnt2);
        input.close();
    }
}