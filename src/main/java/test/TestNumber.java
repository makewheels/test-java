package test;

import java.util.HashSet;
import java.util.Set;

public class TestNumber {
    public static void main(String[] args) {
        for (int p = 1; p <= 1000; p++) {
//        int p=12;
            System.out.print(p + ": ");
            for (int g = 2; g <= p - 1; g++) {
                Set<Long> result = new HashSet<Long>();
                for (int j = 0; j <= p - 2; j++) {
                    long pow = (long) Math.pow(g, j);
                    result.add(pow % p);
                }
//            System.out.print(g + ": " + result);
                if (result.size() == p - 1) {
//                System.out.print(" yes");
                    System.out.print(g + ",");
                }
//            System.out.println();
            }
            System.out.println();
        }
    }
}
