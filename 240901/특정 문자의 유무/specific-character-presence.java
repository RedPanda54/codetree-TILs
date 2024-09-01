import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        if (str.contains("ee"))
            System.out.print("Yes ");
        else
            System.out.print("No ");

        if (str.contains("ab"))
            System.out.print("Yes ");
        else
            System.out.print("No ");

        input.close();
    }
}