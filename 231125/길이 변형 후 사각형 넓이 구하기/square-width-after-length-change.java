import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        width += 8;

        int height = in.nextInt();
        height *= 2;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width*height);

    }
}