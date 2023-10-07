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
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid=middleNode(head);
        ListNode secondNode=reverselist(mid);
        ListNode reversNode=secondNode;

        while(head!=null && secondNode!=null){
            if(head.val!=secondNode.val){
                break;
            }
            head=head.next;
            secondNode=secondNode.next;
        }
        reverselist(reversNode);
        if(head==null || secondNode==null){
            return true;
        }
        return false;
    }
}