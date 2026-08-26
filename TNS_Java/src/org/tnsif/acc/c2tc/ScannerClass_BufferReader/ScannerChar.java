package org.tnsif.acc.c2tc.ScannerClass_BufferReader;


import java.util.Scanner;
public class ScannerChar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		  char ch= scan.next().charAt(3);
		  System.out.println("Fourth charater is "+ch);

	}

}