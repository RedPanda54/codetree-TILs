import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n <= 100) {
            if (n >= 90) {
                System.out.print("A ");
            }
            else if (n >= 80) {
                System.out.print("B ");   
            }
            else if (n >= 70) {
                System.out.print("C ");   
            }
            else if (n >= 60) {
                System.out.print("D ");   
            }
            else {
                System.out.print("F ");
            }
            n++;
        }
    }
}