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
        ListNode crr=head;
        while(crr!=null){
            size++;
            crr=crr.next;
        }

        int prevSize=size-n;
        if(size==n){
            return head.next;
        }
        ListNode prev=head;

        for(int i=1;i<prevSize;i++){
            prev=prev.next;
        }

        prev.next=prev.next.next;
        return head;
    }
}
