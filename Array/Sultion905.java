package leetcode_Array;

class Solution905 {
    public int[] sortArrayByParity1(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while(left < right){
            if(A[left] % 2 >  A[right] % 2){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
            
            if(A[left] % 2 == 0) left++;
            if(A[right] % 2 == 1) right--; 
        }
        return A;
        // �������ǰ���˫ָ�룬ǰ��ɨ��ġ�
    }
    
}