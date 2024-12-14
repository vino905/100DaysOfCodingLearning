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
        
        // Brute force using stack with tc o(N) and space complexity o(N)
//         Stack<Integer> values = new Stack<>();
        
//         ListNode temp = head;
        
//         while(temp!=null){
//             values.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;

        
//         while(temp!=null){
//             temp.val = values.pop();
//             temp = temp.next;
//         }
//         return head;
        
        // optimized tc o(N) and sc o(N) 
        
        // but it also possible that ll have only one node
        
        if( head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
    }
}