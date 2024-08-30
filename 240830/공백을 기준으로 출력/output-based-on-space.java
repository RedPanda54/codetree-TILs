import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String result1 = str1.replaceAll(" ", "");
        String str2 = input.nextLine();
        String result2 = str2.replaceAll(" ", "");

        System.out.print(result1 + result2);

        input.close();
    }
}