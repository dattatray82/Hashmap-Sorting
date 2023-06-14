package com.array;

public class MedianOfTwoSortedArrays {
	static int findMedian(int a[],int b[],int n) {
		int firstMedian=-1;
		int first=0;
		int second=0;
		int secondMedian=-1;
		for(int i=0;i<=n;i++) {
			if(first==n) {  //// 0->false
				firstMedian=secondMedian;
				secondMedian=b[0];
				break;
			}else if (second==n) { /// false
				firstMedian=secondMedian;
				secondMedian=a[0];
				break;
			}if(a[first]<=a[second]) {
				firstMedian=secondMedian;
				secondMedian=a[first];
				first++;	
			}else {
				firstMedian=secondMedian;
				secondMedian=b[second];
				second++;
			}
		}
		return (firstMedian+secondMedian)/2;
	}
	public static void main(String[] args) {
		int a[]= {1,11,12,15,26,38};
		int b[]= {2,13,17,30,45};   ////{1,2,12,13,15,17,26,30,35,38}
		int n=a.length;
		System.out.println("meadian of two sorted arrays:---"+findMedian(a, b, n));
	}

}
