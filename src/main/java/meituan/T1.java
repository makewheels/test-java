package meituan;

import java.util.Scanner;

public class T1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] readLine() {
        String[] split = scanner.nextLine().split(" ");
        int[] line = new int[split.length];
        for (int i = 0; i < split.length; i++)
            line[i] = Integer.parseInt(split[i]);
        return line;
    }

    public static void main(String[] args) {
        int[] firstLine = readLine();
        int targetX = firstLine[0];
        int targetY = firstLine[1];
        int total = firstLine[2];

        int[][] table = new int[total][5];
        for (int i = 0; i < total; i++)
            table[i] = readLine();

    }
}