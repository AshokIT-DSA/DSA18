package org.ar.pointers;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int a[]= {-3,-1,0,15,19};//Conitueous memory block
		int b[]= {-2,0,7,18,19};
		int n=a.length;
		int m=b.length;
		int p1=0,p2=0;
	while(p1<n && p2<m) {	
		if(a[p1]>b[p2]) {
			System.out.print(b[p2]+" ");
			p2++;
		}
		else if(a[p1]<b[p2]) {
			System.out.print(a[p1]+" ");
			p1++;
		}
		else {
			System.out.print(a[p1]+" ");
			p1++;
			System.out.print(b[p2]+" ");
			p2++;
		}
	}
	System.out.println("Remaining Elements of a");
	
	while(p1<n) {
		System.out.print(a[p1]+" ");
		p1++;
	}
	System.out.println("Remaining Elements of b");
	while(p2<m) {
		System.out.print(b[p2]+" ");
		p2++;
	}
	
	}
}
