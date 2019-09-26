package com.cg.labfive.ui;

import com.cg.labfive.exception.*;
public class Lab5f {
public static void salary(double sal){
	if (sal<3000) {
		try {
			throw new EmployeeException("\n"+sal+" Salary is below 3000 Rs ");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}else {
		System.out.println("Your Salary is  => "+sal);
	}
}
public static void main(String[] args) {
	salary(2999);
}
}

