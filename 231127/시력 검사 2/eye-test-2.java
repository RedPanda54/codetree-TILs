import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vision = input.nextDouble();
        if (vision >= 1.0) {
            System.out.println("High");
        }
        else if (vision >= 0.5) {
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }
    }
}