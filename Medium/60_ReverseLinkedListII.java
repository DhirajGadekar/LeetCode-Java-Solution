/*
 * 60] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        if(left == right) {

            return head;
        }
        for(int i = 1; i < left - 1; i++) {

            temp1 = temp1.next;
        }
        for(int i = 1; i < right; i++) {

            temp2 = temp2.next;
        }
        ListNode temp3 = null;
        if(left == 1) {
           temp3 = head;
        } else {
            temp3 = temp1.next;
        }
        ListNode temp4 = temp2.next;
        temp2.next = null;
        ListNode rev = null;
        while(temp3 != null) {

            ListNode temp = temp3;
            temp3 = temp3.next;
            temp.next = rev;
            rev = temp;
        }
        if(left == 1) {
            head = rev;
        } else {
            temp1.next = rev;
        }
        temp3 = head;
        while(temp3.next != null) {

            temp3 = temp3.next;
        }
        temp3.next = temp4;
        return head;
    }
}
