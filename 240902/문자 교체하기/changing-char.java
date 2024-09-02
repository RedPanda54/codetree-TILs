import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        
        String temp = str1.substring(0, 2);
        str2 = temp + str2.substring(2);
        
        System.out.print(str2);

        input.close();
    }
}