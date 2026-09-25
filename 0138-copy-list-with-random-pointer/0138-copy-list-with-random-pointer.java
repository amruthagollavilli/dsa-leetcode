class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Interweave copied nodes (A -> A' -> B -> B')
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers for the copied nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the two interleaved lists
        curr = head;
        Node dummyHead = new Node(0);
        Node copyCurr = dummyHead;

        while (curr != null) {
            Node nextOriginal = curr.next.next;

            // Extract the copy
            Node copy = curr.next;
            copyCurr.next = copy;
            copyCurr = copy;

            // Restore the original list
            curr.next = nextOriginal;
            curr = nextOriginal;
        }

        return dummyHead.next;
    }
}