import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int a = str1.length() + str2.length();
        
        System.out.println(a);
        
        input.close();
    }
}