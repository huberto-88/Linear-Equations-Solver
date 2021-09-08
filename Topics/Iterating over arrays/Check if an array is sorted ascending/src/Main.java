import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>(size);
        boolean isAscending = true;
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
            if (list.get(i) < prev) {
                isAscending = false;
                break;
            }
            prev = list.get(i);
        }
        System.out.println(isAscending);
    }
}