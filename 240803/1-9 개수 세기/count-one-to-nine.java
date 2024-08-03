import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] counting = new int[10];

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            counting[num]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(counting[i]);
        }
    }
}