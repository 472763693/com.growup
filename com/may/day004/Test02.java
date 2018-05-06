package com.may.day004;

public class Test02 {
	public static void main(String[] args) {
		//¾Å¾Å³Ë·¨±í
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
