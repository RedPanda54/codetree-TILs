import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) input.next().charAt(0);
        int b = (int) input.next().charAt(0);
        System.out.printf("%d %d", a + b, a > b ? a - b : b - a);
        input.close();
    }
}