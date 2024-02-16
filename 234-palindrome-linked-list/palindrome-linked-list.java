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

        if(head == null || head.next == null) return true;
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int s = 0;
        int e = arr.size() -1;
        while(s <= e ){
            if(arr.get(s) != arr.get(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}