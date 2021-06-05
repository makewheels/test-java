package algorithm;

import java.util.Scanner;

/**
 * 2021.06.05
 */
public class WeiDian2 {
    private static int index = 0;
    private static String w1;

    public static boolean find(char c) {
        for (; index < w1.length(); index++) {
            if (c == w1.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        w1 = scanner.nextLine();
        String w2 = scanner.nextLine();
        if (w1.length() < w2.length()) {
            System.out.println("no");
            return;
        }
        for (int i = 0; i < w2.length(); i++) {
            char c = w2.charAt(i);
            if (!find(c)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
