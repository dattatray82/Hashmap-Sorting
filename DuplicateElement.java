package com.array;

public class DuplicateElement {
	public static void main(String[] args) {
		int a[]= {1,4,3,3,5,6,7,8,8,9,10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]) {
				System.out.println("Duplicates Element in array>>>"+a[i]+" ");
				a[i]=-1;
			}
			}
		}
		System.out.println("Array without Duplicate");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
