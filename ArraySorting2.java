package com.array;

import java.util.Arrays;

// first half ascending order and other haif desending order..
public class ArraySorting2 {
	static void printorder(int a[],int n) {
		Arrays.sort(a);
		for(int i=0;i<n/2;i++) {
			System.out.print(a[i]+" ");
		}
		for(int j=n-1;j>=n/2;j--) {
			System.out.print(a[j]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,2,1,10,30,40,20};
		int n=a.length;
		printorder(a, n);
	}

}
