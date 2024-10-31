import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    temp++;
                } else {
                    temp += 2;
                }
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        input.close();
    }
}