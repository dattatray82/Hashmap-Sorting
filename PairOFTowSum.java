package com.array;

public class PairOFTowSum {
	public static void main(String[] args) {
		int array[]= {5,8,2,1,7,4,6};
		int sum=10;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]==sum-array[i]) {
				System.out.println(+array[i]+","+array[j]);
			}}
			
		}
	}

}
