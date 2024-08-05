import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        char a = input.next().charAt(0);
        int index = -1;

        for (int i=0; i<6; i++) {
            if (arr[i] == a) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.print("None");
        } else {
            System.out.print(index);
        }
    }
}