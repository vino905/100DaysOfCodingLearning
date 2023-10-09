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
    public int length(ListNode head){
        ListNode temp=head;
        int size=0;

        while(temp!=null){
            temp=temp.next;
            size++;
        }
    return size;    
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null){
            return null;
        }
        int size=length(head);
        int index=size-n;
        ListNode prevNode=null;
        ListNode temp=head;
		for(int i=0;i<index;i++) {
			prevNode=temp;
            temp=temp.next;
		}
        if(prevNode==null){
            head=head.next;
            return head;
        }
        else{
           prevNode.next=prevNode.next.next; 
        }
        
        return head;
    }
}