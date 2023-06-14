package com.array;
// first half ascending order and other haif desending order..
public class ArraySorting {
	static void printorder(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n/2;j++) {
				if(a[j] > a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int j=n/2;j<n-1;j++) {
				if(a[j] < a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
		}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,2,1,10,30,40,20};
		int n=a.length;
		printorder(a, n);
	}

}
