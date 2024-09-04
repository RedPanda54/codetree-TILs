import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 문자열 A와 B를 입력받습니다.
        String A = input.next();
        String B = input.next();

        // 문자열 A에서 문자열 B를 찾고 제거하는 작업을 반복합니다.
        while (A.contains(B)) {
            // 문자열 B가 A에 포함되어 있다면 해당 부분 문자열을 제거합니다.
            A = A.replaceFirst(B, "");
        }

        // 최종 결과를 출력합니다.
        System.out.println(A);

        input.close();
    }
}