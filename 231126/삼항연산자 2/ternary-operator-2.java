import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        String pri = a == 1 ? "t" : "f";
        System.out.println(pri);
    }
}