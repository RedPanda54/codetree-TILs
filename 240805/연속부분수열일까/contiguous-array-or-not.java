import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // n1과 n2를 입력받음
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        // 수열 A와 B
        int[] A = new int[n1];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        int[] B = new int[n2];
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }

        // 연속부분수열 확인
        String answer = "";

        int idx = -1;
        int tmp = B[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == tmp) {
                idx = i;
                break;
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (idx == -1)
                break;
            if (A[idx] != B[i]) {
                idx = -1;
                break;
            }
            idx++;
        }

        if (idx == -1)
            answer = "No";
        else
            answer = "Yes";

        System.out.print(answer);
    }
}