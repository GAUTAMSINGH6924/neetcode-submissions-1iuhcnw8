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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode curr=head;

        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int prevSize=size-n;
        if(size==n){
            return head.next;
        }
        ListNode prev=head;
        while(prevSize!=1){
            prev=prev.next;
            prevSize--;
        }
        prev.next=prev.next.next;
        return head;
    }
}
