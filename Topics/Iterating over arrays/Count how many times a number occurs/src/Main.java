import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        int[] input = IntStream.generate(scanner::nextInt)
                .limit(range)
                .toArray();
        int n = scanner.nextInt();

        long answer = Arrays.stream(input)
                .filter(value -> value == n)
                .count();
        System.out.println(answer);
    }
}