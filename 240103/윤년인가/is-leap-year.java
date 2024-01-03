import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();

        if (y%4 == 0) {
            if (y%100 == 0) {
                if (y%400 == 0) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                System.out.println("true");
            }
        }
        else {
            System.out.println("false");
        }
    }
}