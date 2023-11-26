import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("pass");
        }
        else {
            System.out.printf("%d more score", 80-score);
        }
    }
}