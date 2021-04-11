package history;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        int n = Integer.parseInt(line1);
        String[] strings = line2.split(" ");
        List<Integer> a = new ArrayList<>();
        for (String string : strings) {
            a.add(Integer.parseInt(string));
        }
        int max = a.get(0);
        for (Integer integer : a) {
            if (integer > max) {
                max = integer;
            }
        }
        int xiaomingSum = 0;
        for (Integer integer : a) {
            xiaomingSum += integer;
        }
        for (int k = max; k < 1000000000; k++) {
            int me = 0;
            for (Integer integer : a) {
                me += k - integer;
            }
            if (me > xiaomingSum) {
                System.out.println(k);
                return;
            }
        }

        //1 1 1 5 1
    }
}
