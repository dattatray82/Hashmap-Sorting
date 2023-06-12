package com.value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapSortByValue {
	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "b");
		hm.put(4, "a");
		hm.put(2, "c");
		hm.put(3, "e");
		
		//Before Sorting
		System.out.println("Before Sorting");
		hm.forEach((k,v)->System.out.println(k+", "+v));;
		
		System.out.println("After Sorting");
		List<Map.Entry<Integer, String>> list=new ArrayList<>(hm.entrySet());
		list.sort(Map.Entry.comparingByValue());
		list.forEach((value)->System.out.println(value.getKey()+","+value.getValue()));
		
		
	}

}  
