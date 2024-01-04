import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int end = n * 5;
        for (int i=1; i<=end; i++){
            if (i%n == 0) {
                System.out.print(i + " ");
            }
        }
    }
}