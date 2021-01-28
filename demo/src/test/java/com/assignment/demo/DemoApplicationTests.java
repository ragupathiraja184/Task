package com.assignment.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZohoTest {

	
	public static boolean checkForCloseBracket() {
	String x = "{[]}";
	int count = 0;
	boolean check = true;
	for(int i=0;i<x.length();i++) {
		if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(') {
			count = count++;
		}
		if(x.charAt(i) == '}' || x.charAt(i) == ']' || x.charAt(i) == ')') {
			count = count--;
			if(count < 0)
				check = false;
		}
		
	}
	return check;
	}
	public static void MatrixRotation() {
		int[][] input;
		
	}
	public static void main(String[] args) {
		System.out.print(checkForCloseBracket());
	}

}
