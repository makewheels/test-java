package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Print {
    public static void main(String[] args) {
        System.out.println();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
