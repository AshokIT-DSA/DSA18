package org.ar.pattern;
import java.util.Scanner;

/* ctrl+shift+" +
***--1
***--2
***--3
 *  */
/*
 * 
 *  Mentioned in the program
 */
//****
//****
//****
//****



// HR,LC->Someone is creating ->Server
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=5;
			for(int r=1;r<=n;r++) {
				for(int c=1;c<=n;c++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}


