import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(doBinarySearch(s));
    }


    static int doBinarySearch(String s) {
        int l = 1;
        int r = s.length() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (checkDoubleHash(s, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }


    static boolean checkDoubleHash(String s, int size) {
        int length = s.length();
        int capacity = length - size + 1;
        Map<Long, Long> hashMap = new HashMap<>(capacity);

        long hash1 = 0;
        long hash2 = 0;
        long pow1 = 1;
        long pow2 = 1;

        int a1 = 59;
        int a2 = 53;
        long m1 = 1_000_000_000L + 7;
        long m2 = 1_000_000_000L + 9;

        for (int i = 0; i < size; i++) {
            hash1 += s.charAt(capacity - 1 + i) * pow1;
            hash1 %= m1;

            hash2 += s.charAt(capacity - 1 + i) * pow2;
            hash2 %= m2;

            if (i != size - 1) {
                pow1 = pow1 * a1 % m1;
                pow2 = pow2 * a2 % m2;
            }
        }
        hashMap.put(hash1, hash2);

        for (int i = length; i > size; i--) {
            hash1 = (hash1 - s.charAt(i - 1) * pow1 % m1 + m1) * a1 % m1;
            hash1 = (hash1 + s.charAt(i - size - 1)) % m1;

            hash2 = (hash2 - s.charAt(i - 1) * pow2 % m2 + m2) * a2 % m2;
            hash2 = (hash2 + s.charAt(i - size - 1)) % m2;

            Long hash = hashMap.put(hash1, hash2);
            if (hash != null && hash.equals(hash2)) {
                return true;
            }
        }

        return false;
    }

} // class Main