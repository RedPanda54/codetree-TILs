import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // n칸의 정사각형에서 가장 윗줄과 오른쪽 줄.
                if (i == 0 || j == n - 1) {
                    System.out.print("* ");
                } 
                
                // 나머지 칸의 규칙. 
                else {  
                    if (i > j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        input.close();
    }
}