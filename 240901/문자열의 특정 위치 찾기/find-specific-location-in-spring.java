import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char temp = input.next().charAt(0);

        int idx = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                idx = i;
                break;
            }
        }

        if (idx != -1)
            System.out.print(idx);
        else 
            System.out.print("No");
        input.close();
    }
}