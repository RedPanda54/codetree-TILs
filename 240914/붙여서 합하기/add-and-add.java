import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();

        String AB = A + B;
        String BA = B + A;

        int ABInt = Integer.parseInt(AB);
        int BAInt = Integer.parseInt(BA);
        
        System.out.println(ABInt + BAInt);

        input.close();
    }
}