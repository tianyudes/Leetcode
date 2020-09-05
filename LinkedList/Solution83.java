package Leetcode_LinkedList;

public class Solution83 {

	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        ListNode res = curr;
        while(curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return res;
    }
	//这回忘了什么时候才能移动curr了，想一下12333这样的数组，之前每次都是直接换到下一个话就会出现
	//1 - 2 - 3 - 3现在curr = 3，然后这个时候发现3重复了，直接指向第二个3的next而且 curr也指过去了。变成1-2-3-null这样就会报错。
	//也就是说可以让next为空，但是不能让curr为空。
}
