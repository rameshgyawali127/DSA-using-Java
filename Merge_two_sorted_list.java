class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class Merge_two_sorted_list {
    public static void main(String[] args) {
        ListNode head1 = createListFromArray(new int[]{1, 5, 7, 10});
        ListNode head2 = createListFromArray(new int[]{3, 8, 11, 19});
        ListNode result = mergeTwoLists(head1, head2);
        
        // Print the merged list
        printList(result);
    }

    public static ListNode createListFromArray(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        // Append remaining elements from l1 or l2
        current.next = (l1 != null) ? l1 : l2;
        
        return dummy.next;
    }
}
