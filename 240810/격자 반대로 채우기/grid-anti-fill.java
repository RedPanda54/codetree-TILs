import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];

        int num = 1;
        boolean btn = true;

        for (int i = n - 1; i >= 0; i--) {
            if (btn) {
                for (int j = n - 1; j >= 0; j--) {
                    arr[j][i] = num;
                    num++;
                    btn = false;
                }
            } else { // btn = false;
                for (int j = 0; j < n; j++) {
                    arr[j][i] = num;
                    num++;
                    btn = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        input.close();
    }
}