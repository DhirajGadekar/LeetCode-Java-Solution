/*
 * Merge Two Sorted Lists
 */

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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode head = null;
        ListNode temp = null;
        ListNode tail = null;
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        while(head1 != null && head2 != null) {

            if(head1.val < head2.val) {

                temp = head1;
                //temp.next = null;
                head1 = head1.next;
            } else {
                temp = head2;
                //temp.next = null;
                head2 = head2.next;
            }
            if(head == null) {
                head = temp;
                tail = temp;
            } else {

                tail.next = temp;
                tail = temp;
            }
        }
        if(head1 != null) {

            tail.next = head1;
        } else {

            tail.next = head2;
        }
        return head;
    }
}
