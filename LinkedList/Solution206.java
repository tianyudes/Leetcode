package Leetcode_LinkedList;

public class Solution206 {

}
class Solution206Method1{
	public ListNode reverseList(ListNode head) {
        ListNode reverseHead = new ListNode(0);
        ListNode curr = reverseHead;
        while(head != null){
            if(reverseHead.next == null){
                reverseHead.next = new ListNode(head.val);
                head = head.next;
                curr = reverseHead.next; 
            }else{
                ListNode node = new ListNode(head.val);
                node.next = curr;
                reverseHead.next = node;
                curr = node;
                head = head.next;
            }
        }
        return reverseHead.next;
    }
}
class Solution206Method2{
	public ListNode reverseList(ListNode head) {
	     if (head == null || head.next == null) return head;
	     ListNode p = reverseList(head.next);
	     head.next.next = head;
	     head.next = null;
	     return p;
	     Integer.bitCount(i)
	     }
}
