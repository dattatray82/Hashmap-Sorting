package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		list1.addAll(Arrays.asList(new Integer[] {1,4,-6,2,5,21,22}));
		list2.addAll(Arrays.asList(new Integer[] {12,22,31,-2,55,5}));
		List<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list2);  /// 1,4,-6,2,5,21,22
		list3.retainAll(list1);/// 22 5
		System.out.println(list3);	
	}

}
