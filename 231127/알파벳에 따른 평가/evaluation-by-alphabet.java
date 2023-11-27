import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str == "S") {
            System.out.println("Superior");
        }
        else if (str == "A") {
            System.out.println("Excellent");
        }
        else if (str == "B") {
            System.out.println("Good");
        }
        else if (str == "C") {
            System.out.println("Usually");
        }
        else if (str == "D") {
            System.out.println("Effort");
        }
        else {
            System.out.println("Failure");
        }
    }
}