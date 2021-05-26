package leetcode;

public class T7 {
    public int reverse(int x) {
        String astr = x + "";
        astr = astr.replace("-", "");
        StringBuilder result = new StringBuilder();
        for (int i = astr.length() - 1; i >= 0; i--) {
            result.append(astr.charAt(i));
        }
        try {
            if (x < 0) {
                return Integer.parseInt("-" + result);
            } else {
                return Integer.parseInt(result.toString());
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new T7().reverse(1534236469));
    }

}
