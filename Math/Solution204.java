package Leetcode_Math;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Solution204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pairs = scanner.nextInt();
		String str = scanner.nextLine();
		HashMap<Integer, Integer> map = transform(str, pairs);
		Set<Integer> key = map.keySet();
		Object res = key.iterator();
		
	}
	public static HashMap<Integer, Integer> transform(String str,int pairs) {
		String[] string = str.split(" ");
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < pairs; i++) {
			int key = Integer.parseInt(string[i * 2 ]);
			int value = Integer.parseInt(string[i * 2 ]);
			if(map.containsKey(key)) {
				map.put(key, value + map.get(key));
			}else {
				map.put(key, value);
			}
			
		}
		return map;
	}
}
