package org.ar.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int ar[]= {2,7,5,12,4,-3,8,-1};
				// 0,1,2,3,4
		//i=4-->x=4
		//j=3
		//j=2-->5
		//j=1-->7
		//j=0
		
		
		//2 min
		int n=ar.length;
		for(int i=0;i<n;i++) {
			int x=ar[i];
			//[i-1 to 0]
			int j=0;
			//i=0
			//j=-1
			//-1>=0
			for(j=i-1;j>=0;j--) {
				if(ar[j]>x) {
					ar[j+1]=ar[j];
				}
				else {
					break;
				}
				System.out.println(i);
				System.out.println(Arrays.toString(ar));
			}
			
			ar[j+1]=x;
			System.out.println(Arrays.toString(ar));
			System.out.println();
			System.out.println();
		}
	}
	
}
