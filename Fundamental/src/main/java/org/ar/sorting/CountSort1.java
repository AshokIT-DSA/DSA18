package org.ar.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountSort1 {
	public static void main(String[] args) throws IOException {
		Scanner sc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String 
		 int n=Integer.parseInt(br.readLine());
		String s1[]= br.readLine().split(" ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=Integer.parseInt(s1[i]);
		}
		int countArray[]=new int[11];
		populateTheCountArray(countArray,ar);//O(N)
		int index=findMaxCountIndex(countArray);//10 iteration O(1)
		System.out.println(index+" "+countArray[index]);
	}//O(n)
//Migratory Bird
	private static int findMaxCountIndex(int[] countArray) {
		// TODO Auto-generated method stub
		int max=countArray[1];
		int index=1;
		for(int i=1;i<=10;i++) {
			if(countArray[i]>max) {
				max=countArray[i];
				index=i;
			}
		}
		return index;
	}

	private static void populateTheCountArray(int[] countArray, int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			
			countArray[ar[i]]++;
		}
	}
}
//n
//n space integer

//5
//1 2 3 4 5