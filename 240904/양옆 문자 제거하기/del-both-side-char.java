import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        str = str.substring(0, 1) + str.substring(2);
        str = str.substring(0, str.length() - 2) + str.substring(str.length() - 1);

        System.out.print(str);
        input.close();
    }
}