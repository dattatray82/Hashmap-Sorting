package com.array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountFrequency {
	public static void main(String[] args) {
		int arr[]= {5,5,10,10,20,30};
		Map<Integer, Integer>map=new HashMap<Integer,Integer>();
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
		Set<Integer> set=map.keySet();
		System.out.println(set);
		/*for(Integer integer:set) {
			if(map.get(integer)>1) {
				System.out.println(integer+" its Count "+map.get(integer));
			}
		}*/
	}

}
