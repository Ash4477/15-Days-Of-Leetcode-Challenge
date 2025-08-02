/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = reverse(slow.next);
        slow.next = null;

        while (head2 != null) {
            if (head2.val != head.val) return false;
            head2 = head2.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}