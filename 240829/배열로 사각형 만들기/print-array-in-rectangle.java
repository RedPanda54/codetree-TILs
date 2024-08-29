import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[5][5];

        // 2차원 배열 초기화
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                array[i][j] = 1;

        // 2차원 배열 내용 완성
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                array[i][j] = array[i - 1][j] + array[i][j - 1];
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        input.close();
    }
}