import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][4];

        // 2차원 배열의 원소 입력받기
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                arr[i][j] = input.nextInt();

        double widAverage = 0.0;
        double heiAverage = 0.0;
        double average = 0.0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                widAverage += arr[i][j];
            }
            System.out.printf("%.1f ", widAverage / 4);
            widAverage = 0.0;
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                heiAverage += arr[j][i];
            }
            System.out.printf("%.1f ", heiAverage / 2);
            heiAverage = 0.0;
        }

        System.out.println();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                average += arr[i][j];

        System.out.printf("%.1f", average / 8);
    }
}