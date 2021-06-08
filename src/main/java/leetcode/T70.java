package leetcode;

public class T70 {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        int n1 = 1;
        int n2 = 2;
        int steps = 0;
        for (int i = 3; i <= n; i++) {
            steps = n1 + n2;
            n1 = n2;
            n2 = steps;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new T70().climbStairs(7));
    }
}
