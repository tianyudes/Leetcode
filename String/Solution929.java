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
	//值得注意的几个地方：首先是什么时候用""什么时候用'',
	//其次是转义字符"."是不对的，要用"\\."才对
	//主要还是对String下面的函数不是很熟。
}
