import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int occurents = 1;
        int triples = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {

            if (array[i] == array[i + 1] - 1) {
                occurents++;
                if (occurents == 3) {
                    triples++;
                    occurents = 0;
                    i = i - 2;
                }
            }
        }
        System.out.print(triples);
    }
}
