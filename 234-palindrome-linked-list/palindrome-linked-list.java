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
        if (head == null || head.next == null) return true;
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if (head == null) return true;

        boolean result = solve(head.next);

        if (curr.val == head.val) curr = curr.next;
        else return false;

        return result;
    }
}