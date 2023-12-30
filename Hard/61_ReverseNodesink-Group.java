/*
 * 61] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null || k == 1) {

            return head;
        }
        int itr = k;
        int count = countNode(head);
        ListNode head1 = null;
        ListNode tail = null;
        for(int i = 1; i <= count/2; i++) {

            ListNode rev = null;
            ListNode tailNode = head;
            ListNode t = head;
            int count1 = 0;
            while(t != null && k > 0) {

                count1++;
                t = t.next;
                --k;
            }
            if(count1 != itr) {

                break;
            }
            k = itr;
            while(head != null && k > 0) {

                ListNode temp = head;
                head = head.next;
                temp.next = rev;
                rev = temp;
                --k;
            }
            if(i == 1) {

                head1 = rev;
                tail = tailNode;
            } else {

                tail.next = rev;
                if(tailNode != null) {

                    tail = tailNode;
                }
            }
            k = itr;
        }

        if(head != null) {
            ListNode temp = head1;
            while(temp.next != null) {

                temp = temp.next;
            }
            temp.next = head;
        }
        return head1;
    }
}
