package leetcode;

public class T2 {
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

    private void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        boolean jinwei = false;
        do {
            if (jinwei && l1 == null && l2 == null) {
                temp.next = new ListNode(1);
                break;
            }
            int add = l1.val + l2.val;
            if (jinwei) {
                add++;
            }
            if (add >= 10) {
                add -= 10;
                jinwei = true;
            } else {
                jinwei = false;
            }
            ListNode newNode = new ListNode(add);
            temp.next = newNode;
            temp = newNode;
            l1 = l1.next;
            l2 = l2.next;
        } while (
                (l1 != null && l2 != null)
                        || (jinwei && l1 == null && l2 == null)
        );
        if (l1 != null) {
            temp.next = l1;
        } else if (l2 != null) {
            temp.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a3 = new ListNode(1);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(3, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(5, b3);
        ListNode b1 = new ListNode(8, b2);

        T2 t2 = new T2();
        ListNode listNode = t2.addTwoNumbers(a1, b1);
        t2.print(listNode);
    }
}
