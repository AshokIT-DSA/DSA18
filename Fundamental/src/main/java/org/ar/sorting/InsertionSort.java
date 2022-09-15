package org.ar.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int ar[]= {2,7,5,12,4,-3,8,-1};

		int n=ar.length;
		for(int i=0;i<n;i++) {
			int x=ar[i];		
			int j=0;
			for(j=i-1;j>=0;j--) {
				if(ar[j]>x) {
					ar[j+1]=ar[j];
				}
				else {
					break;
				}
			}
			ar[j+1]=x;
			}
		System.out.println("Sorted Array"+Arrays.toString(ar));
	}
}
