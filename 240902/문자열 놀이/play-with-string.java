import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();  // 초기 문자열 입력
        int q = input.nextInt();    // 질의의 개수 입력

        // StringBuilder 사용하여 효율적으로 문자열 조작
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < q; i++) {
            int num = input.nextInt();

            if (num == 1) {
                // 1 a b: a번째 문자와 b번째 문자를 교환
                int one = input.nextInt() - 1;  // 인덱스는 0부터 시작하므로 -1
                int two = input.nextInt() - 1;

                // 문자 교환
                char temp = sb.charAt(one);
                sb.setCharAt(one, sb.charAt(two));
                sb.setCharAt(two, temp);

            } else if (num == 2) {
                // 2 a b: 문자 a를 모두 문자 b로 변경
                char a = input.next().charAt(0);
                char b = input.next().charAt(0);

                for (int j = 0; j < sb.length(); j++) {
                    if (sb.charAt(j) == a) {
                        sb.setCharAt(j, b);
                    }
                }
            }

            // 현재 문자열 출력
            System.out.println(sb.toString());
        }

        input.close();
    }
}