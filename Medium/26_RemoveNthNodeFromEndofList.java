/*
 * Remove Nth Node From End of List :
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
    int countNode(ListNode head) {

        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    ListNode firstRemove(ListNode head) {

        if(head.next == null) {

            return null;
        } else {

            head = head.next;
            return head;
        }
    }
    ListNode lastRemove(ListNode head) {

        if(head.next == null) {

            return null;
        } else {

            ListNode temp = head;
            while(temp.next.next != null) {

                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = countNode(head);
        if(n <= 0 || n > count) {

            return head;
        } else {
            if(n == 1) {

                return lastRemove(head);
            } else if(n == count) {

                return firstRemove(head);
            } else {

                ListNode temp = head;
                n = count - n + 1;
                while(n - 2 != 0) {

                    temp = temp.next;
                    n--;
                }
                temp.next = temp.next.next;
                return head;
            }
        }
    }
}
