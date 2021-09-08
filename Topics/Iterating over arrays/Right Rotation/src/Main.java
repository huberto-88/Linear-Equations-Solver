import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        int length = arr.length;
        int rotation = scanner.nextInt();
        String[] output = new String[length];
        
        for (int i = 0; i < length; i++) {            
        	output[(i + rotation) % length] = arr[i];
        }
        for(String s : output) {
        	System.out.print(s + " ");
        }
    }
}
