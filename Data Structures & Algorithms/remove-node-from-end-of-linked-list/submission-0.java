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
        ListNode dummy=new ListNode(-1,head);//initially points to head
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;//move fast n steps ahead
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;//move slow and fast together
            fast=fast.next;
        }
        //now slow.next is the target node 
        slow.next=slow.next.next;
        return dummy.next;

    }
}
