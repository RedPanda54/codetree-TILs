import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        str = str.substring(1, str.length()) + str.substring(0, 1);

        System.out.print(str);

        input.close();
    }
}