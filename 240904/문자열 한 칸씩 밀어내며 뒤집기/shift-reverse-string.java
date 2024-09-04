import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 초기 문자열과 요청의 개수 입력
        String str = input.next();
        int q = input.nextInt();
        
        // StringBuilder로 문자열 조작
        StringBuilder sb = new StringBuilder(str);

        // 요청을 순서대로 처리
        for (int i = 0; i < q; i++) {
            int request = input.nextInt();

            if (request == 1) {
                // 가장 앞의 문자를 뒤로 보냄
                char firstChar = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(firstChar);
            } else if (request == 2) {
                // 가장 뒤의 문자를 앞으로 보냄
                char lastChar = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, lastChar);
            } else if (request == 3) {
                // 문자열을 좌우로 뒤집음
                sb.reverse();
            }

            // 각 요청의 결과 출력
            System.out.println(sb.toString());
        }

        input.close();
    }
}