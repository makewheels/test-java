package leetcode;

public class T461 {
    public int hammingDistance(int x, int y) {
        String xBinary = Integer.toBinaryString(x);
        String yBinary = Integer.toBinaryString(y);
        int max = Math.max(xBinary.length(), yBinary.length());
        int diff = Math.abs(xBinary.length() - yBinary.length());
        StringBuilder addString = new StringBuilder();
        for (int i = 0; i < diff; i++) {
            addString.append("0");
        }
        if (xBinary.length() < max) {
            xBinary = addString + xBinary;
        } else {
            yBinary = addString + yBinary;
        }
        int result = 0;
        for (int i = 0; i < xBinary.length(); i++) {
            char xChar = xBinary.charAt(i);
            char yChar = yBinary.charAt(i);
            if (xChar != yChar)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new T461().hammingDistance(1, 4));
    }
}
