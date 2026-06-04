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
        int sum;
        int carry=0,newdigit=0;
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(l1!=null || l2!=null){
            sum=0;
            if(l1!=null){
                sum=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
           newdigit =sum%10;
            carry=sum/10;
            tail.next=new ListNode(newdigit);
            tail=tail.next;
        }
        if(carry!=0){
            tail.next=new ListNode(carry);
            tail=tail.next;
     
        }
        return dummy.next;
    }

}
