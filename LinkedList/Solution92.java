package Leetcode_LinkedList;

public class Solution92 {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		Solution_92 solution = new Solution_92(); 
		ListNode head = solution.reverseBetween(a, 1, 3);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
class Solution_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head.next == null || head == null) return head;
        int change_len = n - m + 1;
        ListNode modify_list_tail = null;
        ListNode pre_head = null;
        ListNode res = head;
        while (head != null && m-- > 1){
            pre_head = head;
            head = head.next;
        }
        
        modify_list_tail = head;
        ListNode new_head = null;
        while (change_len > 0) { // Here shouldn't be change_len--
        	ListNode next = head.next;
        	head.next = new_head;
        	new_head = head;
        	// how to define the new_head.next; no need to write this...
        	head = next;
        	change_len--;
        }
        modify_list_tail.next = head;
        if (pre_head != null) {
        	pre_head.next = new_head;
        }else {
        	res = new_head;
        }
        return res;
    }
    
}


// diyici chuxian kongzhizhen jinggao  

