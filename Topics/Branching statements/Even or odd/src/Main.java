import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStream.generate(scanner::nextInt)
                .takeWhile(n -> n != 0)
                .forEach(value -> {
                    System.out.println(value % 2 == 0 ? "even" : "odd");
                });
    }
}