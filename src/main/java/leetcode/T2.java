package leetcode;

public class T2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }

    public static void main(String[] args) {
        T2.ListNode n3 = new T2.ListNode(3);
        T2.ListNode n2 = new T2.ListNode(2, n3);
        T2.ListNode n1 = new T2.ListNode(1, n2);
        System.out.println(new T2().addTwoNumbers());
    }
}
