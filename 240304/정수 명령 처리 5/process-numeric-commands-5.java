import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        int n = input.nextInt();
        input.nextLine(); // 버퍼 비우기. 입력을 다음 줄로 돌린다.

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split(" ");

            String command = parts[0];

            if (command.equals("push_back") && parts.length == 2) {
                int value = Integer.parseInt(parts[1]);
                array.add(value);
            } else if (command.equals("pop_back")) {
                if (!array.isEmpty()) {
                    array.remove(array.size() - 1);
                } else {
                    continue;
                }
            } else if (command.equals("size")) {
                System.out.println(array.size());
            } else if (command.equals("get")) {
                int value = Integer.parseInt(parts[1]);
                if (value >= 1 && value <= array.size()) {
                    int element = array.get(value - 1);
                    System.out.println(element);
                } else {
                    System.out.println("Index Error");
                }
            }
        }
    }
}