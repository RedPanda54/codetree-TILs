import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp < 0) {
            System.out.println("ice");
        }
        else if (temp >= 100) {
            System.out.println("vapor");
        }
        else {
            System.out.println("water");
        }
    }
}