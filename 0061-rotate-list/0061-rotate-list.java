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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next==null){
            return head;
        }

        ListNode tail = head;
        int count = 1;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }
        tail.next = head;
        if(k >= count){
            k = k % count;
        }
        k = count - k ;
        tail = head;
        for(int i = 1 ; i < k ; i++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;

        return head;
        
    }
}