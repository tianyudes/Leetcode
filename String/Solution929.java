package leetcode_String;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {

	
}
class Solution929Method1{
	public int numUniqueEmails(String[] emails) {
        Set<String> addr = new HashSet<>();
        for(String mails : emails){
            String[] local = mails.split("@");
            //String rest = mails.substring(i);
            
            if(local[0].contains("+")){
                local[0] = local[0].substring(0, local[0].indexOf('+'));
            }
            local[0] = local[0].replaceAll("\\.","");
            addr.add(local[0] + local[1]);
        }
        return addr.size();
    }
	//ֵ��ע��ļ����ط���������ʲôʱ����""ʲôʱ����'',
	//�����ת���ַ�"."�ǲ��Եģ�Ҫ��"\\."�Ŷ�
	//��Ҫ���Ƕ�String����ĺ������Ǻ��졣
}
