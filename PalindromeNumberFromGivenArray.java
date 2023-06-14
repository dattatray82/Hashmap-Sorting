package com.array;

public class PalindromeNumberFromGivenArray {
	public static void main(String[] args) {
		int array[] = { 121, 122, 123, 141 };
		for (int i = 0; i < array.length; i++) {
			int n = array[i];
			int reverse = 0;
			while (n > 0) {
				int modulus = n % 10;
				reverse = modulus + (reverse * 10);
				n = n / 10;
			}
			if (reverse == array[i]) {
				System.out.println(array[i]);
			}
		}

	}

}
