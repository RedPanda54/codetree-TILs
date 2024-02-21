import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.next();
        int n = input.nextInt();

        if (c.equals("A")) {
            for (int i=1; i<=n; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i=n; i>0; i--) {
                System.out.print(i + " ");
            }   
        }
    }
}