package org.ar.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//N M
//Elements of an array
public class CountSort2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String 
		String s[]=br.readLine().split(" ");
		 int n=Integer.parseInt(s[0]);
		 int m=Integer.parseInt(s[1]);
		String s1[]= br.readLine().split(" ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=Integer.parseInt(s1[i]);
		}
		//1<=ar[i]<=10
		//0<=ar[i]<=m
		int countArray[]=new int[m+1];
	
		populateTheCountArray(countArray,ar);//O(N)
		System.out.println(Arrays.toString(countArray));
		sort(countArray,ar);//10 iteration O(1)//O(n+m)
		System.out.println(Arrays.toString(ar));
	}//O(2n+r),r
	//Migratory Bird
	//0 1 2 3 4(index)
	//2 3 1 0 1(value)
	//0 0 1 1 1 2 4
	private static void sort(int[] countArray,int ar[]) {
		// TODO Auto-generated method stub
//11 7
	//	3 5 1 3 5 7 3 4 4 6 4
		int m=countArray.length;
		int index=0;
		for(int i=0;i<m;i++) {
			int frequency=countArray[i];
			for(int j=1;j<=frequency;j++) {
				ar[index]=i;
				index++;
		}//O(n+r)
	}
	}
	private static void populateTheCountArray(int[] countArray, int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			
			countArray[ar[i]]++;
		}
	}
}

