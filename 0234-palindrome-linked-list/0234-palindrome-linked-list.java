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
    public ListNode reverseLL(ListNode head){
        if(head ==null || head.next == null ){
            return head;
        }
        
        ListNode newHead = reverseLL(head.next);
        
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        
        // brute force using stack . with tc o 2 (N) and sc o(N)
        
//         Stack<Integer> st = new Stack<>();
        
//         ListNode temp = head;
//         while(temp!=null){
//             st.push(temp.val);
//             temp = temp.next;
//         }
        
//         temp = head;
//         while(temp!=null){
//             if(temp.val!=st.pop()){
//                 return false;
//             }
//             temp = temp.next;
//         }
//     return true;    
        
        // But we have to optimized the code and we don't have to use extra space with SC O(1) a
        //     and TC O 2(N) 
        
        if(head ==null || head.next == null ){
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode newHead = reverseLL(slow.next);
        
        ListNode first = head;
        ListNode second = newHead;
        
        while(second!=null){
            if(second.val!=first.val){
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
     reverseLL(newHead);
     return true;   
    }
}