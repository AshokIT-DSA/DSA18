package org.ar.sorting;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
			int ar[]= {1,2,3,4};
			int len=ar.length;
			//Outer loop is used only for the no of iteration
			for(int i=0;i<len-1;i++) {
				boolean isSorted=true;
				for(int j=0;j<len-1-i;j++) {
					
					if(ar[j]>ar[j+1]) {
						isSorted=false;
						swap(ar,j);
					}
				}
				if(isSorted)
					break;
				System.out.println(Arrays.toString(ar));
				System.out.println();
				System.out.println();
			}
			
	}

	private static void swap(int[] ar,int j) {
		// TODO Auto-generated method stub
		int temp=ar[j];
		ar[j]=ar[j+1];
		ar[j+1]=temp;
		}
}
