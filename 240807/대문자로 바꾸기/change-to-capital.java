import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] arr = new char[5][3];

        char tmp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                tmp = input.next().charAt(0);
                arr[i][j] = Character.toUpperCase(tmp);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}