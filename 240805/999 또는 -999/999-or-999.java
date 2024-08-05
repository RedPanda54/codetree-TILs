import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int maxValue = num;
        int minValue = num;
        while (true) {
            num = input.nextInt();
            if (num == 999 || num == -999)
                break;
            
            if (num > maxValue)
                maxValue = num;
            else if (num < minValue)
                minValue = num;
        }
        
        System.out.print(maxValue + " " + minValue);
    }
}