import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            int n = input.nextInt();
            if (n%2 == 1) {
                continue;
            }
            else {
                System.out.println(n/2);
                count++;
            }
        }
    }
}