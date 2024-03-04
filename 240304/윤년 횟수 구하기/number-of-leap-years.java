import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leap_year = 0;

        for (int year = 1; year <= n; year++) {
            if (year % 100 == 0 && year % 400 != 0) {
                continue;
            } else if (year % 4 == 0) {
                leap_year++;
            } else {
                continue;
            }
        }

        System.out.println(leap_year);
    }
}