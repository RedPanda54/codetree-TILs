import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int a = input.nextInt();
            if (a % 2 == 1) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}