package com.array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class OddEven {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println("Print odd number");
	for(Integer integer:a) {
		if(integer%2!=0) {
			System.out.println(integer);
		}
	}
	System.out.println("Print even number");
	for(Integer integer:a) {
		if(integer%2==0) {
			System.out.println(integer);
		}
	}
	}
}
