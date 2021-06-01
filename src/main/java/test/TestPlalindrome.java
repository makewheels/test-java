package test;

public class TestPlalindrome {
    private boolean is(int a) {
        String str = a + "";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 1230321;
        System.out.println(new TestPlalindrome().is(a));
    }
}
