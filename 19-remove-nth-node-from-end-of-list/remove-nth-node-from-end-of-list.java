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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int len = (cnt - n);
        if(len == 0) head = head.next;

        else{
            ListNode prev = head;
            while(len -1 != 0){
                prev = prev.next;
                len--;
            }
            prev.next = prev.next.next;
        }
        return head;
    }
}