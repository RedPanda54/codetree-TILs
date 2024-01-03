import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cool = new String[3];
        int[] temp = new int[3];
        int count = 0;

        for (int i=0; i<temp.length; i++) {
            cool[i] = input.next();
            temp[i] = input.nextInt();
        }
        for (int i=0; i<temp.length; i++) {
            if (cool[i].equals("Y")) {
                if (temp[i] >= 37)
                    count += 1;
            }
        }
        
        if (count >= 2) 
            System.out.println("E");
        else 
            System.out.println("N");
    }
}