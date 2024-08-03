import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counting = new int[10];

        int num;
        while (true) {
            num = input.nextInt();
            if (num == 0) break;
            num %= 100;
            num /= 10;
            counting[num]++;
        }

        for (int i = 1; i < 10; i++)
            System.out.println(i + " - " + counting[i]);
    }
}