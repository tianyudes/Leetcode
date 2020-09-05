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
        
    }//添加了限制条件必须是以6或者28结尾才ok
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
	//这个平方的我想过，但是后面因为14的平方一定吵了就放弃了，但是实际上是可以通过找到左边小的直接加上大的，只找一边，这样少了很多。
}
