package leetcode;

public class T1915 {
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(new T1915().replaceSpace("We are happy."));
    }
}
