import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] input = new int[size];

		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}

		int seeking = sc.nextInt();
		boolean find = false;

		for (int i : input) {
			if (i == seeking) {
				find = true;
				break;
			}
		}

		System.out.println(find ? "true" : "false");
	}
}
