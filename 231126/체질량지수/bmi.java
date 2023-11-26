import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int weight = in.nextInt();
        weight = (weight*100)*100;

        int BMI = weight/(height*height);
        System.out.println(BMI);

        if (BMI >= 25) {
            System.out.println("Obesity");
        }
    }
}