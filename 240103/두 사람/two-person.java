import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1 = input.nextInt();
        String gen1 = input.nextLine();

        int age2 = input.nextInt();
        String gen2 = input.nextLine();

        if ((age1 >= 19 && gen1.equals("M")) || (age2 >= 19 && gen2.equals("M"))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}