import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        int b = input.nextInt();
        
        System.out.print((int) a + " ");
        System.out.print((char) b);

        input.close();
    }
}