package Leetcode_LinkedList;

public class Solution142 {

	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		a.next= b;
//		ListNode c = new ListNode(0);
//		ListNode d = new ListNode(4);
//		a.next = b;
//		b.next = c;
//		c.next = d;
//		d.next = b;
		Solution02 solution = new Solution02();
		solution.detectCycle(a);
	}
}
class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
            fast = head;
            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
            
        }
        
        }
        return null;
    }
}

class Solution02{
		public ListNode detectCycle(ListNode head) {
	        if (head == null || head.next == null) return null;
	        ListNode fast = head;
	        ListNode slow = head;
	        while (fast != null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	            if (fast == slow){
	            fast = head;
	            while(fast != slow){
	                fast = fast.next;
	                slow = slow.next;
	            }
	            return fast;
	            
	        }
	        
	        }
	        return null;
	    }
}