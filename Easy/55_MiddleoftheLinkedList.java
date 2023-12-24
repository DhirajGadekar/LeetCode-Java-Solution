/*
 * 55] Middle of the Linked List
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
    int countNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int count = countNodes(head) / 2;
        for(int i = 0; i < count; i++) {
            head = head.next;
        }
        return head;
    }
}
