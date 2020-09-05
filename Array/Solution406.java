package leetcode_Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Solution406 {
	public static void main(String[] args) {
		int[][] people = {{7,0},{4,4},{7,1},{5,0}, {6,1},{5,2}};
		Solution_406 solution = new Solution_406();
		int[][] res = solution.reconstructQueue(people);
		for (int[] i : res) {
			System.out.println(i.toString());
		}
		
		
		
	}
}

class Solution_406{
	public int[][] reconstructQueue(int[][] peoples) {
        Arrays.sort(peoples,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> list = new LinkedList();
        for(int[] people:peoples){
            list.add(people[1],people);
        }
        return list.toArray(new int[peoples.length][]);
    }
	
}
