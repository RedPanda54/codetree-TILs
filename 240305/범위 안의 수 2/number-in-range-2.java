import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterator = 1;
        int count = 0;
        int sum = 0;
        double average = 0.0;
        
        while (iterator != 10) {
            int num = input.nextInt();
            if (num >= 0 && num <= 200) {
                count++;
                sum += num;
            }
            input.nextLine();
            iterator++;
        }
        
        average = sum / count;
        System.out.print(sum + " ");
        System.out.printf("%.1f", average);
    }
}