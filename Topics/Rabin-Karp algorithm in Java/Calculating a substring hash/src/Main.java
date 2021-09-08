import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = Integer.parseInt(sc.nextLine());

        int a = 53;
        long m = 1_000_000_009;
        long[] hq = new long[s.length() + 1];

        long subh = 0;
        long p = 1;

        for (int i = 0; i < s.length(); i++) {
            subh += charToLong(s.charAt(i)) * p;
            subh %= m;

            if (i != s.length() - 1) {
                p *= a;
                p %= m;
            }
            hq[i + 1] = subh;
        }

        ArrayList<String> hal = new ArrayList<>();
        for (long i : hq) {
            hal.add("" + i);
        }
        System.out.println(String.join(" ", hal.subList(1, hal.size())));

        hal = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            sc.nextLine();

            hal.add((hq[r] - hq[l] + m) % m + "");
        }
        System.out.println(String.join(" ", hal));
    }

    public static long charToLong(char ch) {
        return (long) (ch - 'A' + 1);
    }
}