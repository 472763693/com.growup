package com.may.day002;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份:");
		int years = input.nextInt();
		
		System.out.println("请输入月份:");
		int months = input.nextInt();
		
		if(years > 3000 || years < 0) {
			System.out.println("您输入的年份有误!");
		}else if(months > 12 || months < 0) {
			System.out.println("您输入的月分有误!");
		}else if((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
			switch(months) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(years+ "年的" + months + "月有" + 31 + "天");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(years+ "年的" + months + "月有" + 30 + "天");
				break;
				
			case 2:
				System.out.println(years+ "年的" + months + "月有" + 29 + "天");
				break;
			}
		}else {
			switch(months) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(years+ "年的" + months + "月有" + 31 + "天");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(years+ "年的" + months + "月有" + 30 + "天");
				break;
				
			case 2:
				System.out.println(years+ "年的" + months + "月有" + 28 + "天");
				break;
			}
		}
	}
}
