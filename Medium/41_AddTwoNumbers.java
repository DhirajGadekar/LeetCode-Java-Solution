/*
 * 41] Add Two Numbers
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode t3 = null;
        ListNode t4 = null;
        while(t1 != null && t2 != null) {

            int rem = (t1.val + t2.val + carry) % 10;
            carry = (t1.val + t2.val + carry) / 10;
            t1.val = rem;
            t2.val = rem;

            t3 = t1;
            t4 = t2;
            t1 = t1.next;
            t2 = t2.next;
        }
        boolean flag1 = false, flag2 = false;
        while(t1 != null) {

            flag1 = true;
            int rem = (t1.val + carry) % 10;
            carry = (t1.val + carry) / 10;
            t1.val = rem;

            t3 = t1;
            t1 = t1.next;
        }
        while(t2 != null) {

            flag2 = true;
            int rem = (carry + t2.val) % 10;
            carry = (carry + t2.val) / 10;
            t2.val = rem;

            t4 = t2;
            t2 = t2.next;
        }
        if(flag1 == true) {

            if(carry != 0) {
                t3.next = new ListNode(carry);
            }
            return l1;
        } else {
            if(carry != 0) {
                t4.next = new ListNode(carry);
            }
            return l2;
        }
    }
}
