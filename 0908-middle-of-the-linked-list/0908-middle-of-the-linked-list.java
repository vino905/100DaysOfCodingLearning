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
    public ListNode middleNode(ListNode head) {
        
        ListNode nSpeed=head;
        ListNode n2Speed=head;
        while(n2Speed!=null && n2Speed.next!=null){
           nSpeed=nSpeed.next;
           n2Speed=n2Speed.next.next;
        
        }
    return nSpeed;


    }
}