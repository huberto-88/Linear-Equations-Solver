import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array  = new int[scanner.nextInt()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean result = false;
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == m && array[i+1] == n) {
				result = true;
			} else if (array[i] == n && array[i+1] == m) {
				result = true;
			}
		}
		System.out.println(result);
	}
}
