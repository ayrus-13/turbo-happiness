package com.cg.labeight.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab8c {
	public static void fileReader(File f) {
		String line;
		//int c=0;
		int Line=0;
		int words=0;
		int chart=0;
	try {
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fi);
		BufferedReader br=new BufferedReader(isr);
		while ((line=br.readLine())!=null) {
			//System.out.println(Line+" "+line);
			
			if(!line.equals("")) {
				chart+=line.length();
				String[]word=line.split(" ");
				words +=word.length;
				
			}
			Line++;	
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("line "+Line);
	System.out.println("words "+words);
	System.out.println("char "+chart);
	}
	
	
	public static void main(String[] args) {
		File f=new File("D:\\Suman\\File.txt");
		fileReader(f);
	}
}

