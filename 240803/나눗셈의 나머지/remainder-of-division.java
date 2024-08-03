import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counting = new int[10];
        int a = input.nextInt();
        int b = input.nextInt();
        int c;
        
        while (a > 1) {
            c = a%b;
            a = a/b;
            counting[c]++;
        }
        
        int sum = 0;
        for (int i=0; i<10; i++) {
            counting[i] = (int) Math.pow(counting[i], 2);
            sum += counting[i];
        }
        
        System.out.print(sum);
    }
}