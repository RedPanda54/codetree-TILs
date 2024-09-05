import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        int a = (int) ch;
        
        if (ch == 'z') 
            a -= 25;
        else 
            a += 1;
        
        ch = (char) a;
        System.out.println(ch);

        input.close();
    }
}