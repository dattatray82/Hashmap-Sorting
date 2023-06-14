package com.array;

//Maximum and minimum of an array using minimum number of comparisons
public class SUMOfMaxANDMin {
	public static int findSum(int a[], int n) {
		int min = a[0];
		int max = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		sum = min + max;
		return sum;

	}

	public static void main(String[] args) {
		int a[]= {3, 5, 4, 1, 9};
		int n=5;
		System.out.println(findSum(a, n));
		

	}
}
