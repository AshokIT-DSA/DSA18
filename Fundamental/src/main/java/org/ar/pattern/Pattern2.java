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
// HR,LC->Someone is creating ->Server
public class Pattern2 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter the value of n");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
			
	}
}
//i=1 

