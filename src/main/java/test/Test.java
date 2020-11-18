package test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        for (long g = 1; g <= 5; g++) {
            Set<Long> result = new HashSet<Long>();
            for (long j = 0; j <= 4; j++) {
                long pow = g * j;
                result.add(pow % 6);
            }
            System.out.print(g + ": " + result);
            if (result.size() == 5) {
                System.out.print(" yes");
            }
            System.out.println();
        }
    }
}
