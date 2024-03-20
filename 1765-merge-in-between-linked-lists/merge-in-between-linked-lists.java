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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode an=null;
        ListNode bn=null;
        int idx=0;
        while(temp!=null){
            if(idx==a-1) an=temp;
            if(idx==b+1) bn=temp;
            temp=temp.next;
            idx++;
        }  
        an.next=list2;
          getTail(list2).next=bn;
        return list1;


    }

    public ListNode getTail(ListNode head){
        while(head.next!=null){
            head=head.next;
        }
        return head;
    }
}