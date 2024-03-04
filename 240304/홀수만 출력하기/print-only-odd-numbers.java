import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        List<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            if (a % 2 == 1 && a % 3 == 0) {
                array.add(a);
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(array.get(i));
        }
    }
}