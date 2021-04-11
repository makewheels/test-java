package leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    @Test
    public void twoSumHash() {
        int[] input1 = {2, 7, 11, 15};
        int[] input3 = {3, 1, 3};
        int target1 = 9;
        int target2 = 6;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input1.length; i++) {
            map.put(input1[i], i);
        }
        for (int i = 0; i < input1.length; i++) {
            int find = target1 - input1[i];
            if (map.containsKey(find)) {
                System.out.println(i);
            }
        }
    }
}
