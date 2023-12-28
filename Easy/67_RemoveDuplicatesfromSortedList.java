/*
 * 67] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode right = head;
        ListNode left = head;
        while(right != null) {

            if(left.val == right.val) {

                right = right.next;
                left.next = right;
            } else {

                left = right;
                right = right.next;
            }
        }
        return head;
    }
}
