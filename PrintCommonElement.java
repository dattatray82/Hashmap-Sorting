package com.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintCommonElement {
	public static void main(String[] args) {
		int a[]= {80,10,15,35,60,2};
		int b[]= {35,60,80,20,75,2};
		
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		/*for(int j=0;j<b.length;j++) {
			if(set.contains(b[j])) {
				System.out.println(b[j]);
			}
		}*/                                     //// print duplicate element,
		for(int j=0;j<b.length;j++) {
			set.add(b[j]);
		}
		System.out.println(set);            //// remove dulplicate and print.
	}

}
