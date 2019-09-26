package com.cg.labnine.ui;

import java.util.Iterator;
import java.util.Map;

import com.cg.labnine.bean.*;
public class Lab9b {
public static void main(String[] args) {
	char[]a= {'a','a','b','b','c','c','d','a'};
Map<String, Integer>m=	Lab9b.countCharacter(a);
System.out.println("Character counts are: "+m);
}
}

