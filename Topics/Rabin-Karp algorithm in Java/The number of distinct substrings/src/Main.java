import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        int result = RabinKarpClass.countDistinctSubstrings(text);
        System.out.println(result);
    }
}

class RabinKarpClass {
    public static long charToLong(char ch) {
        return (long) (ch - 'A' + 1);            // ch - 65 + 1
    }

    public static int countDistinctSubstrings(String text) {
        int a = 53;
        long m = 1_000_000_000 + 9;
        Set<Long> hashValues = new HashSet<>();
        hashValues.add(-1L);                    // adding emptyString

        for (int i = 0; i < text.length(); i++) {
            String substring = text.substring(i);
            long hash = 0;
            long pow = 1;

            for (int j = 0; j < substring.length(); j++) {
                hash += charToLong(substring.charAt(j)) * pow;
                hash %= m;

                if (j != substring.length() - 1) {
                    pow = pow * a % m;
                }
                hashValues.add(hash);
            }
        }
        return hashValues.size();
    }
}
