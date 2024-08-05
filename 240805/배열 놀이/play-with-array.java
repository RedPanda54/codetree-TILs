import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int q1, q2, q3;
        for (int i = 0; i < q; i++) {
            // 질의 번호를 입력 받음
            q1 = input.nextInt();

            // 질의 번호에 따라 다른 명령문을 실행
            if (q1 == 1) {
                q2 = input.nextInt();
                System.out.println(nums[q2 - 1]);
            } else if (q1 == 2) {
                int tmp = 0;
                q2 = input.nextInt();
                for (int j = 0; j < n; j++) {
                    if (nums[j] == q2) {
                        tmp = j + 1;
                        break;
                    }
                }
                System.out.println(tmp);
            } else {    // q1 == 3
                q2 = input.nextInt();
                q3 = input.nextInt();
                for (int j = q2 - 1; j <= q3 - 1; j++) {
                    System.out.print(nums[j] + " ");
                }
                System.out.println();
            }
        }
    }
}