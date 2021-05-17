package meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Integer> readLine() {
        String[] split = scanner.nextLine().split(" ");
        List<Integer> line = new ArrayList<>(split.length);
        for (String s : split)
            line.add(Integer.parseInt(s));
        return line;
    }

    public static void main(String[] args) {
        List<Integer> firstLine = readLine();
        int total = firstLine.get(0);
        List<List<Integer>> lists = new ArrayList<>(total);
        for (int i = 0; i < total; i++)
            lists.add(readLine());
        System.out.println(lists);
    }
}
