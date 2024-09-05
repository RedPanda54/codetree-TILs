import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        
        if (a == 'a')
            System.out.print("z");
        else 
            System.out.print((char) (a - 1));

        input.close();
    }
}