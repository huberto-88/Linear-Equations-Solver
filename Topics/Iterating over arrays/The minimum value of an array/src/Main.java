import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
