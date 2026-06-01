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
    public ListNode reverseList(ListNode head) {
        //store the next pointer 
        //prev pointer null initially
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            //to move to next node
            next=curr.next;
            //main reverse operation
            curr.next=prev;
            //prev movess to curr and curr goes to next for the next node 
        prev=curr;
        curr=next;
        }
        //curr becomes null loop stop but prev has updated curr value that is the new head 
        return prev;
        
    }
}
