import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String str = input.nextLine();

            if (str.equals("END")) {
                break;
            }

            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }

        input.close();
    }
}