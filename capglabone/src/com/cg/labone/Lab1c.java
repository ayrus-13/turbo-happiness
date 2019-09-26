package com.cg.labone;

import java.util.Scanner;

public class Lab1c {
		static boolean checkNumber(long num)
		{
			boolean flag=true; 
			while(num!=0)
			{
				long i1=num%10;
				num=num/10;
				if(i1<num%10)
				{
					flag=false;
				}
			}
			return flag;
		}
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number Sequence:");
			Long num=sc.nextLong();
			boolean sum =checkNumber(num);
			if(sum)
				System.out.println("It is an Increasing Number Sequence.");
			else
				System.out.println("It is Not an Increasing Number Sequence.");
			sc.close();
		}
	}


