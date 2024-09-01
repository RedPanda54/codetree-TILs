import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        
        String temp1 = A + B;
        String temp2 = B + A;
        
        if (temp1.equals(temp2)) System.out.println("true");
        else System.out.println("false");
        
        input.close();
    }
}