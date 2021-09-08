import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int theBiggestOrder = 0;
        int counter = 0;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            counter = input > temp ? ++counter : 1;
            theBiggestOrder = counter > theBiggestOrder ? counter : theBiggestOrder;
            temp = input;
        }
        System.out.println(theBiggestOrder);
    }
}
