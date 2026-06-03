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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode revHead=reverse(slow.next);
         ListNode second=revHead;
        slow.next=null;
       
        ListNode first=head;
       
        ListNode firstNext;
        ListNode secondNext;
        while(second!=null){
            firstNext=first.next;//save first.next
            secondNext=second.next;//save second.next
            first.next=second;//connect first to second
            second.next=firstNext;//connect second to first.next
            first=firstNext;//move first
            second=secondNext;//move second 
        }
            
    }
}
