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
       public ListNode reverselist(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode next = head.next;

        while(head!=null){
               head.next=prev;
               prev=head;
               head=next;
               if(next!=null){
                   next=next.next;
               }
        }
    return prev;    
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode  slow=head;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        
        }
    return slow;
    }

    public void reorderList(ListNode head) {
        
        ListNode mid = middleNode(head);
        ListNode secondNode=reverselist(mid);
        ListNode first=head;
        while(first!=null && secondNode!=null ){
            ListNode temp= first.next;
            first.next=secondNode;
            first=temp;

            temp=secondNode.next;
            secondNode.next=first;
            secondNode=temp;

        }
        if(first!=null){
            first.next=null;
        }
    }
}