import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] counting = new int[1001];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxValue = 0;
        int value;
        for (int i = 0; i < n; i++) {
            value = arr[i];

            // maxValue 갱신 작업
            if (value > maxValue) {
                maxValue = value;
            }

            // value 카운팅
            counting[value]++;
        }
        input.close();

        while (true) {
            if (maxValue == 0) {
                System.out.print(-1);
                break;
            }

            if (counting[maxValue] == 1) {
                System.out.print(maxValue);
                break;
            }
            else { // counting[maxValue] != 1
                maxValue--;
            }
        }
    }
}