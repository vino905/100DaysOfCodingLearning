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
    public boolean isPalindrome(ListNode head) {
        
        // brute force using stack . with tc o 2 (N) and sc o(N)
        
        Stack<Integer> st = new Stack<>();
        
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            if(temp.val!=st.pop()){
                return false;
            }
            temp = temp.next;
        }
    return true;    
    }
}