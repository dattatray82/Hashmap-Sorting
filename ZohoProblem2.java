package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ZohoProblem2 {
	public static void main(String[] args) {
		String s="aabbbcccc";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);		
			}else {
				map.put(ch, 1);
			}
		}
		Set<Character> set=map.keySet();
		for(Character character:set) {
			System.out.print(character+""+map.get(character));
		}
	}

}
