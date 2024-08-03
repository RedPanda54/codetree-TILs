import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counting = new int[4];
        char symp;
        int temp;

        for (int i=0; i<3; i++) {
            symp = input.next().charAt(0);
            temp = input.nextInt();
            if (symp == 'Y' && temp >= 37)
                counting[0]++;
            else if (symp == 'N' && temp >= 37)
                counting[1]++;
            else if (symp == 'Y' && temp < 37)
                counting[2]++;
            else 
                counting[3]++;
        }
        
        for (int i=0; i<4; i++)
            System.out.print(counting[i] + " ");
        if (counting[0] >= 2)
            System.out.print("E");
    }
}