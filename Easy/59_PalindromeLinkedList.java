/*
 * 59] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode newList = null;
        ListNode temp = head;
        while(temp != null) {

            ListNode node = new ListNode(temp.val);
            node.next = newList;
            newList = node;
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {

            if(newList.val != temp.val) {

                return false;
            }
            temp = temp.next;
            newList = newList.next;
        }
        return true;
    }
}
