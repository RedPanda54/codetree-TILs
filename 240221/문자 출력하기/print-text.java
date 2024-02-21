import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        for (int i=0; i<8; i++) {
            System.out.print(name);
        }
    }
}