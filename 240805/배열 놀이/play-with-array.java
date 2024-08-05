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

        int qType, a, b;
        for (int i = 0; i < q; i++) {
            // 질의 번호를 입력 받음
            qType = input.nextInt();

            // 질의 번호에 따라 다른 명령문을 실행
            if (qType == 1) {
                a = input.nextInt();
                System.out.println(nums[a - 1]);
            } else if (qType == 2) {
                int index = -1;
                a = input.nextInt();
                for (int j = 0; j < n; j++) {
                    if (nums[j] == a) {
                        index = j;
                        break;
                    }
                }
                System.out.println(index);
            } else {    // qType == 3
                a = input.nextInt();
                b = input.nextInt();
                for (int j = a - 1; j <= b - 1; j++) {
                    System.out.print(nums[j] + " ");
                }
                System.out.println();
            }
        }
    }
}