import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];

        int a = 1;
        // 2차원 배열의 원소 입력받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = a;
                System.out.print(arr[i][j] + " ");
                a++;
            }
            System.out.println();
        }
    }
}