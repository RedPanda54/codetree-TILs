import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 3;
        while (i <= a) {
            System.out.print(i + " ");
            i = i + 3;
        }
    }
}