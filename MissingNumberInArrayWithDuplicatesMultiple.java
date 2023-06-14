package com.array;

public class MissingNumberInArrayWithDuplicatesMultiple {
	public static void main(String[] args) {
		int a[]= {2,2,5,9,100,18,18,15,29};
		int copy[]=new int[200];///max number of array +1=100+1..
		for(Integer i:a) {
		copy[i]=1;//// small elemet -1=2-1=1
		}
		for(int i=1;i<copy.length;i++) {
			if(copy[i]==0) {
				System.out.print(i+" ");
			}
		}
	}

}
