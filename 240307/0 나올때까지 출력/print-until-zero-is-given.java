import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        List<Integer> array = new ArrayList<>();

        while (true) {
            n = input.nextInt();
            if (n == 0) {
                break;
            }

            array.add(n);
            input.nextLine();
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}