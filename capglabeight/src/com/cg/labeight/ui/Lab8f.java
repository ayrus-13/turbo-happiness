package com.cg.labeight.ui;

import java.time.LocalDate;
import java.time.Period;

public class Lab8f {
	public static void dateCalculation(LocalDate ld) {
		LocalDate l=LocalDate.now();
		Period diff=Period.between(ld, l);
		System.out.println("Date Difference yyyy/mm/dd :  "+diff.getYears()+"/"+diff.getMonths()+"/"+diff.getDays());
	}
	public static void main(String[] args) {
		LocalDate ld=LocalDate.of(2016,04,12);
		Lab8f.dateCalculation(ld);
	}

}

