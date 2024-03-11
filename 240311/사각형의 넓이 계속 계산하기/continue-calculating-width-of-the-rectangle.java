import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        int height;
        String a = "A";

        while (true) {
            width = input.nextInt();
            height = input.nextInt();
            a = input.next();
            System.out.println(width * height);

            if (a.equals("C"))
                break;
        }
    }
}