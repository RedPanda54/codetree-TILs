import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int boundary = n;

        for (int i = 0; i < n; i++) { // 총 줄의 수
            if (boundary == n) {
                for (int j = 0; j < 2 * n; j++) {
                    System.out.print("*");
                }
            } else { // boundary != n
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            boundary--;
        }
    }
}