import java.util.*;

public class Main {
    public static void printStars() {
        for (int i = 0; i < 10; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) printStars();
        input.close();
    }
}