package algorithm;

import java.util.Scanner;

/**
 * 2021.06.05
 */
public class WeiDian1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m == 1) {
            System.out.println(true);
            return;
        }
        if (m % 2 != 0) {
            System.out.println(false);
            return;
        }
        while (m >= 1) {
            m = m >> 1;
            if (m == 1) {
                System.out.println(true);
                return;
            } else if (m % 2 != 0) {
                System.out.println(false);
                return;
            }
        }
    }
}
