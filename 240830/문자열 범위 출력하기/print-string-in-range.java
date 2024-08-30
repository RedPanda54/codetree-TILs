import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        System.out.print(str.substring(2, 10));
        input.close();
    }
}