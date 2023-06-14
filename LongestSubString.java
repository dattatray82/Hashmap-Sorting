package com.array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	static int lengthoflongestString(String str) {
		int maxcount=0;
		int i=0;
		int j=0;
		int strlength=str.length();
		Set<Character> set=new HashSet<>();
		while(i<strlength && j< strlength) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				maxcount=Math.max(maxcount, j-i);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxcount ;
		
	}
	public static void main(String[] args) {
		String str="abcabcb";
		int len=lengthoflongestString(str);
		System.out.println(len);
	}

}
