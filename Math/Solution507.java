package Leetcode_Math;

public class Solution507 {

}
class Solution507Method1{
	public boolean checkPerfectNumber(int num) {
        if(num < 6 || num % 2 == 1) return false;
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
class Solution507Method2{
	public boolean checkPerfectNumber(int num) {
        if(num % 10 == 6 || num % 100 == 28){
            int sum = 0;
            for(int i = 1; i <= num / 2; i++){
                if(num % i == 0){
                    sum += i;
                }
        } 
            return sum == num;
       
        }else{
            return false;
        }
        
    }//���������������������6����28��β��ok
}
class Solution507Method3{
	public boolean checkPerfectNumber(int num) {
        if(num <= 0) return false;
        if(num % 10 == 6 || num % 100 == 28){
            int sum = 1;
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    sum += i;
                    if( i * i != num){
                        sum += num / i;
                    }
                } 
            }
            return sum == num;
        }else{
            return false;
        }
    }
	//���ƽ��������������Ǻ�����Ϊ14��ƽ��һ�����˾ͷ����ˣ�����ʵ�����ǿ���ͨ���ҵ����С��ֱ�Ӽ��ϴ�ģ�ֻ��һ�ߣ��������˺ܶࡣ
}
