package org.ar.array;
public class MissingNumber {
	public static void main(String[] args) {
		//1-10
		// 1 value is missing
		// Constraint 
		//Problem Statement
		int ar[] = { 1,2,5,4 };
		int ar1[]= {1,2,3,4,5};//Natural NUmber-1 
		int n=5;
		int sum1= (n*(n+1))/2;
		int sum2= findSum(ar);
		System.out.println(sum1-sum2);
		//Whole NUmber --0
		//Sum of first N natural number --> N*(n+1)/2
		//5*6/2
		//=>15
		
		
		for(int i=1;i<=5;i++) {//{
			 boolean isPresent= find(ar,i);
			 if(isPresent==false)
				 System.out.println(i);
				 
		}
		
	}

	private static int findSum(int[] ar) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;
	}

	private static boolean find(int[] ar, int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==k)
				return true;
		}
		return false;
		
	}


}
