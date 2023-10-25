public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
        return null;
    }
    int length = 0;
    ListNode current = head;
    while (current != null) {
        length++;
        current = current.next;
    }
    if (n >= length) {
        return head.next;
    }
    int positionToRemove = length - n; 
    current = head;
    for (int i = 0; i < positionToRemove - 1; i++) {
        current = current.next;
    }
    current.next = current.next.next;

    return head;
}
