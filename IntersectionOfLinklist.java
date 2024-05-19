// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfLinklist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != tempB){
            tempA = tempA != null ?  tempA.next: headB;
            tempB = tempB != null ?  tempB.next: headA;
        }
        return tempA;
    }

    // Method to print the elements of a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Create linked lists for testing
        ListNode commonNode = new ListNode(8);
        commonNode.next = new ListNode(4);
        commonNode.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = commonNode;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = commonNode;

        // Print the lists
        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        // Find and print the intersection node
        IntersectionOfLinklist solution = new IntersectionOfLinklist();
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection Node: " + intersectionNode.val);
        } else {
            System.out.println("No Intersection Node");
        }
    }
}
