import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 수열 A
        int n1 = input.nextInt();
        int[] A = new int[n1];

        // 수열 B
        int n2 = input.nextInt();
        int[] B = new int[n2];

        for (int i = 0; i < n1; i++) {
            A[i] = input.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            B[i] = input.nextInt();
        }

        String answer = "";

        int index = -1;
        int tmp = B[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == tmp) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (index == -1)
                break;
            if (A[index] != B[i]) {
                answer = "No";
                break;
            }
            index++;
        }

        if (index == -1) {
            answer = "No";
        }

        System.out.println(answer);
    }
}