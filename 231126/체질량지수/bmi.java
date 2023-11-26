import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextInt();
        int weight = in.nextInt();
        height = height/100;

        double BMI = weight/height;
        System.out.println(BMI);

        if (BMI >= 25) {
            System.out.println("Obesity");
        }
    }
}