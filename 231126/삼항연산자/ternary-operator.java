import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        String pf = score == 100 ? "pass" : "failure";
        System.out.println(pf);
    }
}