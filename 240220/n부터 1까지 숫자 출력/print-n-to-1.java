import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }   
    }
}