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

    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode midPrev=head;
        ListNode slow=head;
       if(head.next==null){
           head=null;
           return head;
       }
       while(fast!=null && fast.next!=null){
             midPrev=slow;
             slow=slow.next;
             fast=fast.next.next;
            
       }
        midPrev.next=slow.next;
    return head;    
    }
}