import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n != 0) {
            sum += n;
            n = scanner.nextInt();

            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}