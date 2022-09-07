package org.ar.matrix;
import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// row num 2
		int m = sc.nextInt();// col num 3
		int mat[][] = new int[n][m];
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				mat[r][c] = sc.nextInt();
			}
		}
		printTransposeMatrix(mat,n,m);
	}
	// Input--> Transpose--> Printing rowwise
	//Input--> COl wise printing

	/*
	 * 1 2 3 4 5 6
	 * 
	 * -> 1 4 2 5 3 6
	 */
	private static void printTransposeMatrix(int[][] mat,int n,int m) {
		// TODO Auto-generated method stub
		for(int c=0;c<m;c++) {
			for(int r=0;r<n;r++) {
				System.out.print(mat[r][c]+" ");
			}
			System.out.println();
		}
	}
}
