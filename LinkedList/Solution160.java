package Leetcode_LinkedList;

public class Solution160 {

	
}
class Solution160Method1{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    if(headA == null || headB == null) return null;
	    ListNode a = headA;
	    ListNode b = headB;
	    while(headA != null && headB != null){
	        headA = headA.next;
	        headB = headB.next;
	    }
	    while(headA != null){
	        a = a.next;
	        headA = headA.next;
	    }   
	    while(headB != null){
	        b = b.next;
	        headB= headB.next;
	    }
	    while(a != null && b != null){
	        if(a == b){
	            return a;
	        }
	            a = a.next;
	            b = b.next;
	        
	    }
	    return null;
	}
}
class Solution160Method2{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(headA != null && headB != null){
            headA = headA.next;
            headB = headB.next;
        }
        while(headA != null){
            a = a.next;
            headA = headA.next;
        }   
        while(headB != null){
            b = b.next;
            headB= headB.next;
        }
        while(a != b ){
                a = a.next;
                b = b.next;
            
        }
        return a;
    }
	//这个的结尾写的很节省空间。
}

