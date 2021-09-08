import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}

		int n = sc.nextInt();
		int sum = 0;
		
		for (int i : input) {
			if (i > n) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
