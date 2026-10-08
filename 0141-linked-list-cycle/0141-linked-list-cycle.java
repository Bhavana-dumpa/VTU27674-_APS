class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            // Slow moves one step
            slow = slow.next;

            // Fast moves two steps
            fast = fast.next.next;

            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end, so no cycle
        return false;
    }
}