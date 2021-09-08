import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        int max = 0;
        
        for (int i = 0; i < numberOfElements; i++) {
        	array[i] = scanner.nextInt();
        }
        
        if (numberOfElements == 2) {
        	System.out.println(array[0] * array[1]);
        } else {
            
            for (int i = 0; i < numberOfElements - 2; i++) {
            	int temp = Math.max(array[i] * array[i + 1], array[i + 1] * array[i + 2]);
            	if (temp > max) {
            		max = temp;
            	}
            }
        	System.out.println(max);
        }
    }
}
