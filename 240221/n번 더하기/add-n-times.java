import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();

        int result = a;
        for (int i=0; i<n; i++) {
            result += n;
            System.out.println(result);
        }
    }
}