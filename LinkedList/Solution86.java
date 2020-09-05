package Leetcode_LinkedList;

public class Solution86 {

	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(3);
		ListNode e = new ListNode(5);
		ListNode f = new ListNode(2);
		ListNode g = new ListNode(3);
		ListNode h = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = null;
		
		Solution_86 solution = new Solution_86();
		ListNode head = solution.partition(a, 4);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
class Solution_86{
	public ListNode partition(ListNode head, int x) {
		
	        ListNode moreHead = new ListNode(0);
	        ListNode lessHead = new ListNode(0);
	        ListNode moreTail = moreHead;
	        ListNode lessTail = lessHead;
	        while(head != null) {
	        	if (head.val < x) {
	        		lessTail.next = head;
	        		lessTail = lessTail.next;
	        	}else {
	        		moreTail.next = head;
	        		moreTail = moreTail.next;
	        	}
	        	head = head.next;
	        }
	        moreTail.next = null;
	        lessTail.next = moreHead;
	        return lessHead.next;
//	        ListNode curr = head;
//	        while (curr != null) {
//	        	ListNode next = curr.next;
//	        	if (curr.val < x) {
//	        		if (lessHead == null) {
//	        			lessHead = lessTail = curr;
//	        			curr.next = null;
//	        		}else {
//	        			lessTail.next = curr;
//	        			lessTail = curr;
//	        			lessTail.next = null; 
//	        		}
//	        	}else {
//	        		if (moreHead == null) {
//	        		    moreHead = moreTail = curr;
//	        			curr.next = null;
//	        		}else {
//	        		    moreTail.next = curr;
//	        			moreTail = curr;
//	        			moreTail.next = null; 
//	        		}
//	        		
//	        	}
//	        	curr = next;
//	        }
//	        
//	        if (moreHead == null || lessHead == null ) {
//	        	return moreHead == null ? lessHead : moreHead;
//	        }else {
//	        	lessTail.next = moreHead;
//	        	return lessHead;
//	        }
	    }
}
