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
        ListNode temp=head;
        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int helper=length-n;
        temp=head;
        if(helper<=0){
            return temp.next;
        }
        int i=1;
        while(i<helper){
            i++;
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}
