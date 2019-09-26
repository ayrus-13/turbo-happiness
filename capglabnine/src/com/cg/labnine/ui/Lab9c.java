package com.cg.labnine.ui;

import java.util.Map;

import com.cg.labnine.bean.Exercise3;;
public class Lab9c {
public static void main(String[] args) {
	int []a= {10,20,40};
	Map<Integer, Integer>m=Lab9c.getSquares(a);
	System.out.println("Numbers and their squares are: "+m);
}
}