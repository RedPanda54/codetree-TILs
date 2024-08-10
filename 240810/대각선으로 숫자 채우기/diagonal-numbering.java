import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // n과 m 입력
        int n = input.nextInt();
        int m = input.nextInt();

        // n * m 크기의 2차원 배열 생성
        int[][] arr = new int[n][m];

        int num = 1;

        // 대각선 방향으로 숫자 채우기
        for (int d = 0; d < n + m - 1; d++) {
            int row, col;

            if (d < m) {
                row = 0;
                col = d;
            } else {
                row = d - m + 1;
                col = m - 1;
            }

            while (row < n && col >= 0) {
                arr[row][col] = num++;
                row++;
                col--;
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}