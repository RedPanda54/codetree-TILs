import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        String temp;
        temp = s;
        s = t;
        t = temp;
        System.out.println(s);
        System.out.println(t);
    }
}