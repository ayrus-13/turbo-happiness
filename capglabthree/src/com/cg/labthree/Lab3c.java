package com.cg.labthree;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3c {
	public static int[] getSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			String 	strings=Integer.toString(a[i]);
			//System.out.println(a[i]);
			char []rev=strings.toCharArray();
			strings="" ;
			for (int j = rev.length-1; j>=0;j--) {
				strings+=rev[j]+"";
			}
			//System.out.println(strings);
			a[i]=Integer.parseInt(strings);
			//System.out.println(a[i]);
		}	
		Arrays.sort(a);	
		return a;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to accept as an integer array:");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter "+x+" Numbers:");
		for(int i =0;i<x;i++) {
			a[i]=sc.nextInt();	
		}
		a=Lab3c.getSort(a); //method call
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}