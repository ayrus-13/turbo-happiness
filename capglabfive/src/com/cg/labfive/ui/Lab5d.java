package com.cg.labfive.ui;

import com.cg.labfive.exception.Lab5dException;;
public class Lab5d {
	static void employeeName(String fname,String lname){
		if (fname.isEmpty()|lname.isEmpty()) {
			try {
				throw new Lab5dException("\n Please Enter the Names Correctly.!");
			} catch (Lab5dException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeName("akshat", "aman");
	}

}

