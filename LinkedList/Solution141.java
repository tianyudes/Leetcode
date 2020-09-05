package Leetcode_LinkedList;

import java.util.HashSet;

public class Solution141 {

}
class Solution141Method1{
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next; //����ط�һ����ʼ��ʱ��fast����ǰ��ģ�Ҫ��Ȼֱ�ӵ�һ���жϾ��ҵ��ˡ�
        while(slow.next != null && fast.next != null){
            if(slow == fast){
                return true;
            }else{
                slow = slow.next;
                fast = fast.next;
                if(fast.next != null){
                    fast = fast.next;
                }
            }
        }
        return false;
    }
}
class Solution141Method2{
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
class Solution141Method3{
	public boolean hasCycle(ListNode head) {
	    if (head == null || head.next == null) {
	        return false;
	    }
	    ListNode slow = head;
	    ListNode fast = head.next;
	    while (slow != fast) {
	        if (fast == null || fast.next == null) {
	            return false;
	        }
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return true;
	}
}
class Solution141Wrong{
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next; //����ط�һ����ʼ��ʱ��fast����ǰ��ģ�Ҫ��Ȼֱ�ӵ�һ���жϾ��ҵ��ˡ�
        while(slow.next != null && fast.next != null && fast != null){ //����ôд���fast��null�Ļ��������ȫ���Ǵ�ģ�null��û��next��
            if(slow == fast){
                return true;
            }else{
                slow = slow.next;
                fast = fast.next.next;
                }
            }
       return false;
        }
        
}