package com.cg.labfive.ui;

public class Lab5b {
	
public static void nonRecursive(int i) {
	int a=1;
	int b=1;
	System.out.print(a+","+b);
	while(i>0) {
		int c=a+b;
		a=b;
		b=c;
		System.out.print(","+c);
		i--;
	}
	
}
public static int Recursive(int n) {

	if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return Recursive(n - 1) + Recursive(n - 2);
}
	
	public static void main(String[] args) {
	//Exercise2 e=new Exercise2();
	System.out.println("Non-Recursive method result:");
	nonRecursive(5);
	System.out.println("\nRecursive method result:");
	System.out.print(""+Recursive(6));
	
}
}

