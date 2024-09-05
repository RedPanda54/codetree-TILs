import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 문자열 입력
        String str = input.next();
        
        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // 문자열 순회
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // 영문자 또는 숫자인 경우만 처리
            if (Character.isLetterOrDigit(c)) {
                // 영문자는 소문자로 변환
                result.append(Character.toLowerCase(c));
            }
        }
        
        // 결과 출력
        System.out.println(result.toString());
        
        input.close();
    }
}