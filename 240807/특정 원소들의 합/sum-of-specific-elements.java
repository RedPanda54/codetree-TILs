import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];

        // 2차원 배열의 원소 입력받기
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                arr[i][j] = input.nextInt();

        int sum = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j <= i; j++)
                sum += arr[i][j];
        
        System.out.print(sum);
    }
}