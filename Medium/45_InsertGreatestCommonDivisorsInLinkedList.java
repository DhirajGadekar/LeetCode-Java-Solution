/*
 * 45] Insert Greatest Common Divisors in Linked List
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;
        ListNode temp2 = null;

        while(temp.next != null) {

            temp2 = temp;
            temp = temp.next;
            ListNode node = new ListNode(gcd(temp2.val, temp.val));
            temp2.next = node;
            node.next = temp;
        }

        return head;
    }
    public int gcd(int num1, int num2){

        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
}
