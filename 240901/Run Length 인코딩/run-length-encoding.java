import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String result = "";

        int cnt = 0;
        char temp = A.charAt(0);
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == temp) {
                cnt++;
            }
            else { // A.charAt(i) != temp
                result += temp;
                result += cnt;
                cnt = 1;
                temp = A.charAt(i);
            }
        }
        result += temp;
        result += cnt;

        System.out.println(result.length());
        System.out.println(result);
        input.close();
    }
}