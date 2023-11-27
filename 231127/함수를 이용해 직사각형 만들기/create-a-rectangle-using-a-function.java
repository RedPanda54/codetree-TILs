import java.util.Scanner;

public class Main {
    public static void printRectangular(int n, int m) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        printRectangular(n, m);
    }
}