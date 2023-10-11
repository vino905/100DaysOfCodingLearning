/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode dummyA=headA;
        ListNode dummyB=headB;

        while(dummyA!=dummyB){
            dummyA=dummyA==null?headB:dummyA.next;
            dummyB=dummyB==null?headA:dummyB.next;

        }
    return dummyA;    
    }
}