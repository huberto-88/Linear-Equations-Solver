import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int tester = 1;
        boolean isAscending = true;
        
        for(int i=0; i<input.length-1; i++) {
        	tester = input[i].compareTo(input[i+1]);
        	if(tester > 0) {
        		isAscending = false;
        		break;
        	}
        }
        System.out.println(isAscending);
    }
}
