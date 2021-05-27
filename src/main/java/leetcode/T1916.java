package leetcode;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class T1916 {
    public int[] reversePrint(ListNode head) {
        if (head == null)
            return new int[0];
        List<Integer> list = new ArrayList<>();
        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        Collections.reverse(list);
        Object[] objects = list.toArray();
        int[] result = new int[objects.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) objects[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println(Arrays.toString(new T1916().reversePrint(node1)));
    }
}
