package com.cg.labone;

import java.util.Scanner;

public class Lab1d {
	static boolean checkNumber(int n)
	{
		int N=n;
		int s=1;
		n=n/2;
		boolean flag=false; 
		while(n!=0)
		{
			s *=2;
			if(N==s)
			{
				flag=true;
			}
			n--;
		}
		return flag;
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		boolean Sum =checkNumber(num);
		if(num==1) {
			System.out.println("Power of 2.");
		}
		else if(Sum) {
			System.out.println("Power of 2.");
		}else {
			System.out.println(" Not a Power of 2.");
		}
		sc.close();
	}

}
