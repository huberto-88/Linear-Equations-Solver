import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 	// consume remaining new line character from scanner.nextInt();
		ArrayList<Double> tax = new ArrayList<>();
        String[] income = scanner.nextLine().split(" ");
        double max = 0;
        
        for (int i = 0; i < n; i++) {
            tax.add((scanner.nextDouble() * Double.parseDouble(income[i])) / 100);
            max = tax.get(i) > max ? tax.get(i) : max;
        }
        System.out.println(tax.indexOf(max) + 1);
    }
}
