import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for(int i=1; i < size; i++) {
        	array[i] = scanner.nextInt();
        }
        array[0] = scanner.nextInt();
        
        for(int i : array) {
        	System.out.print(i + " ");
        }
    }
}
