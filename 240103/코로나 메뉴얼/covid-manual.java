import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cool = input.next();
        int temp = input.nextInt();
        
        if (cool.equals("Y")) {
            if (temp >= 37) {
                System.out.println("A");
            }
            else {
                System.out.println("C");
            }
        }
        else {
            if (temp >= 37) {
                System.out.println("B");
            }
            else {
                System.out.println("D");
            }
        }
    }
}