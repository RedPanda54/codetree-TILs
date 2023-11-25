import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ahrt = a/b;
        int skajwl = a%b;
        System.out.println(ahrt + "..." + skajwl);
    }
}