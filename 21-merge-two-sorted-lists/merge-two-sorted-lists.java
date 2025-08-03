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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return list1;
        ListNode head = new ListNode();
        ListNode retHead = head;
        while (list1 != null & list2 != null) {
            if (list1.val < list2.val) {
                head.val = list1.val;
                list1 = list1.next;
            } else {
                head.val = list2.val;
                list2 = list2.next;
            }
            head.next = new ListNode();
            head = head.next;
        }

        while (list1 != null) {
            head.val = list1.val;
            if (list1.next == null) head.next = null;
            else {
                head.next = new ListNode();
                head = head.next;
            }
            list1 = list1.next;
        }

        while (list2 != null) {
            head.val = list2.val;
            if (list2.next == null) head.next = null;
            else {
                head.next = new ListNode();
                head = head.next;
            }
            list2 = list2.next;
        }

        return retHead;
    }
}