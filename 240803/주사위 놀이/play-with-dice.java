import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int[] counting = new int[7];

        for (int i = 0; i < 10; i++) {
            int cube = input.nextInt();
            counting[cube]++;
        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + " - " + counting[i]);
        }
    }
}