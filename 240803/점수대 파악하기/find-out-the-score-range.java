import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counting = new int[11];

        int score;
        while (true) {
            score = input.nextInt();
            if (score == 0)
                break;
            
            score /= 10;
            counting[score]++;
        }
        
        for (int i=10; i>=1; i--)
            System.out.println(i + "0 - " + counting[i]);
    }
}