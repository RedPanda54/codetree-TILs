import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        if (money >= 3000) {
            System.out.println("book");
        }
        else if (money >= 1000) {
            System.out.println("mask");
        }
        else {
            System.out.println("no");
        }
    }
}