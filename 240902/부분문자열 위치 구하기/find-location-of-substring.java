import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String goal = input.next();

        int idx = -1;
        for (int i = 0; i <= str.length() - goal.length(); i++) {
            if (str.substring(i, i + goal.length()).equals(goal)) {
                idx = i;
                break;
            }
        }

        System.out.print(idx);

        input.close();
    }
}