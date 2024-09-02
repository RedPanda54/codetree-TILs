import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String goal = input.next();

        int idx = -1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(goal)) {
                idx = i;
            }
        }

        System.out.print(idx);

        input.close();
    }
}