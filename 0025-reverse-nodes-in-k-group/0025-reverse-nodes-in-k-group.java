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
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
    return len;    
    }
    public ListNode reverse(ListNode head,int k,int length){
      if(head==null || head.next==null|| k==1 ||length<k){
          return head;
      }
      ListNode prev=null;
      ListNode curr=head;
      ListNode next=null;
      int cnt=1;
      while(curr!=null && cnt<=k){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
          cnt++;
      }
      if(next!=null){
          head.next=reverse(next,k,(length-k));
      }
      head=prev;
      return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=length(head);
        return reverse(head,k,len);
    }
}