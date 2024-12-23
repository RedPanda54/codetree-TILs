import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 입력
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.next();
        char a = input.next().charAt(0);

        // 계산
        int count = 0;
        double total = 0.0;
        double average = 0.0;
        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == a) {
                count++;
                total += arr[i].length();
            }
        }
        average = total / count;

        // 출력
        System.out.printf("%d %.2f", count, average);

        input.close();
    }
}