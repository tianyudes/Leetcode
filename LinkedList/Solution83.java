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
	//�������ʲôʱ������ƶ�curr�ˣ���һ��12333���������飬֮ǰÿ�ζ���ֱ�ӻ�����һ�����ͻ����
	//1 - 2 - 3 - 3����curr = 3��Ȼ�����ʱ����3�ظ��ˣ�ֱ��ָ��ڶ���3��next���� currҲָ��ȥ�ˡ����1-2-3-null�����ͻᱨ��
	//Ҳ����˵������nextΪ�գ����ǲ�����currΪ�ա�
}
