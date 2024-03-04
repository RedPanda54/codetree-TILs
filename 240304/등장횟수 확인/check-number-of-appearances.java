import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            int a = input.nextInt();
            if (a % 2 == 0) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}