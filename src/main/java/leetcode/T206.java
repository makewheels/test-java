package leetcode;


public class T206 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private void print(ListNode head) {
        do {
            System.out.print(head.val + " ");
            head = head.next;
        } while (head != null);
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (true) {
            ListNode nextNode = p2.next;
            p2.next = p1;
            if (nextNode == null) {
                head.next = null;
                return p2;
            }
            p1 = p2;
            p2 = nextNode;
        }
    }

    public static void main(String[] args) {
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        T206 t206 = new T206();
        t206.print(n1);
        ListNode reverseList = t206.reverseList(n1);
        t206.print(reverseList);

    }
}
