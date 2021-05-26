package leetcode;

public class T1190 {
    private String once(String s) {
        if (!s.contains("("))
            return s;
        if (!s.contains(")"))
            return s;
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                leftIndex = i;
        }
        for (int i = s.length() - 1; i >= leftIndex; i--) {
            if (s.charAt(i) == ')')
                rightIndex = i;
        }
        StringBuilder reverse = new StringBuilder(s.substring(leftIndex + 1, rightIndex)).reverse();
        return s.substring(0, leftIndex) + reverse + s.substring(rightIndex + 1);
    }

    public String reverseParentheses(String s) {
        s = s.replace("()", "");
        String once = once(s);
        while (once.contains("("))
            once = once(once);
        return once;
    }

    public static void main(String[] args) {
        System.out.println(new T1190().reverseParentheses("sxmdll(q)eki(x)"));
    }
}
