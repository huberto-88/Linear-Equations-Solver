import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    final static long M = 1_000_000_000L + 9L;
    final static int A = 53;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8.name());
        String s = sc.nextLine();

        int t = sc.nextInt();

        int[][] pairs = new int[t][4];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                pairs[i][j] = sc.nextInt();
            }
        }

        System.out.println(doIt(s, t, pairs));
    }

    static int doIt(String s, int t, int[][] pairs) {
        int result = 0;

        long[] prefixHashArray = new long[s.length()];
        long[] powerArray = new long[s.length()];
        long hash = 0;
        long power = 1;
        for (int i = 0; i < s.length(); i++) {
            hash += charToLong(s.charAt(i)) * power;
            hash %= M;
            prefixHashArray[i] = hash;

            powerArray[i] = power;
            power = power * A % M;
        }

        for (int i = 0; i < t; i++) {
            int posI, posJ, posK, posM;
            if (pairs[i][0] > pairs[i][2]) {
                posI = pairs[i][2];
                posJ = pairs[i][3];
                posK = pairs[i][0];
                posM = pairs[i][1];
            } else {
                posI = pairs[i][0];
                posJ = pairs[i][1];
                posK = pairs[i][2];
                posM = pairs[i][3];
            }

            long hashLeft = prefixHash(posI, posJ, prefixHashArray);
            long hashRight = prefixHash(posK, posM, prefixHashArray);

            if (hashLeft * powerArray[posK - posI] % M == hashRight) {
                result++;
            }
        }
        return result;
    }

    private static long prefixHash(int left, int right, long[] prefixHashArray) {
        if (left == 0) {
            return prefixHashArray[right - 1];
        }
        long leftHash = prefixHashArray[left - 1];
        long rightHash = prefixHashArray[right - 1];

        return (rightHash - leftHash + M) % M;
    }

    private static long charToLong(char ch) {
        return (long) (ch - 'A' + 1);
    }

} // class Main

