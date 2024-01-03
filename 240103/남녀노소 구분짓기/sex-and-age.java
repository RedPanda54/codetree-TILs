import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int gen = input.nextInt();

        if (age == 0) {
            if (gen >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else {
            if (gen >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
    }
}