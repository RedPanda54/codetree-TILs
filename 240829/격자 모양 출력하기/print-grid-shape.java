import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < m; i++) {
            int r = input.nextInt();
            int c = input.nextInt();
            arr[r - 1][c - 1] = r * c;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}