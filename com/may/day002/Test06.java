package com.may.day002;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("请输入年份:");
		Scanner input = new Scanner(System.in);
		
		int years = input.nextInt();
		if(years > 3000 || years < 0) {
			System.out.println("输入的年份有误!");
		}else if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
			System.out.println("您输入的是闰年!");
		}else {
			System.out.println("输入的不是闰年哦!");
		}
	}
}
