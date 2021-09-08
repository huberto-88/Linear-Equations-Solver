import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        scanner.close();
        System.out.println(index);
    }

}