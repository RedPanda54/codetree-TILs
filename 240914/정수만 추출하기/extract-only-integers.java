import java.util.*;

public class Main {
    // 문자열의 앞부분에서 정수 부분을 추출하는 함수
    public static int extractInteger(String str) {
        StringBuilder number = new StringBuilder();
        
        // 문자열의 앞부분에서 숫자만 추출
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number.append(str.charAt(i));
            } else {
                break; // 숫자가 아닌 문자를 만나면 중단
            }
        }
        // 추출한 문자열을 정수로 변환
        return Integer.parseInt(number.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 두 개의 문자열 입력
        String str1 = input.next();
        String str2 = input.next();
        
        // 각 문자열에서 정수 부분 추출
        int num1 = extractInteger(str1);
        int num2 = extractInteger(str2);
        
        // 두 정수의 합 출력
        System.out.println(num1 + num2);
        
        input.close();
    }
}