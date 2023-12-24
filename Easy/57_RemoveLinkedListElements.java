/*
 * 57] Remove Linked List Elements
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        boolean flag = false;
        if(head == null) {


        }else if(head.next == null) {

            if(head.val == val) {

                head = null;
            }
        }else {

            while(temp.next != null) {

                if(flag == false && temp.val == val) {

                    temp = temp.next;
                    head = temp;
                } else if(temp.next.val == val) {

                    temp.next = temp.next.next;
                } else {

                    temp = temp.next;
                }
            }
            if(head == temp && temp.val == val) {

                head = null;
            }
        }
        return head;
    }
}
