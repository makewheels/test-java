package leetcode;

import java.math.BigInteger;

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

    private BigInteger getNumber(ListNode head) {
        ListNode each = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (each != null) {
            each = each.next;
            stringBuilder.append(each.val);
        }
        return new BigInteger(stringBuilder.reverse().toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger n1 = getNumber(l1);
        BigInteger n2 = getNumber(l2);
        BigInteger add = n1.add(n2);
        
    }

    public static void main(String[] args) {

        System.out.println(new T2().addTwoNumbers());
    }
}
