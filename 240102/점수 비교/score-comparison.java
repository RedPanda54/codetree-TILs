import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math_a = input.nextInt();
        int english_a = input.nextInt();
        int math_b = input.nextInt();
        int english_b = input.nextInt();

        if (math_a > math_b && english_a > english_b) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}