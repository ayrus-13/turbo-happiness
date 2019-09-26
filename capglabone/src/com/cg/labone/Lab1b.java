package com.cg.labone;

import java.util.Scanner;

class Lab1b
{
	static double calculateDiff(double n) {
		double diff=0;
		diff=(n*(n+1)*(2*n+1))/6 - Math.pow(((n*(n+1))/2),2 );
		
		return Math.abs(diff);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter a Natural Number:");
			int num=sc.nextInt(); 
			if(num==0) {
				System.out.println("Please enter a Natural Number only!");
				continue;
			}
			else {
				System.out.println("Difference between the sum of the squares and the square of the sum of the first "+num+" natural numbers is: "+ (int) calculateDiff(num));
				sc.close();
				break;
			}
		}
	}
}