package test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        for (long g = 1; g <= 12; g++) {
            Set<Long> result = new HashSet<Long>();
            for (long j = 0; j <= 11; j++) {
                long pow = (long) Math.pow(g, j);
                result.add(pow % 13);
            }
            System.out.print(g + ": " + result);
            if (result.size() == 12) {
                System.out.print(" yes");
            }
            System.out.println();
        }
    }
}
