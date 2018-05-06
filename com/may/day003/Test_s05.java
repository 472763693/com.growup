package com.may.day003;

import java.util.Scanner;

public class Test_s05 {
	public static void main(String[] args) {
		System.out.println("请输入项数:");
		
		Scanner input = new Scanner(System.in);
		int team = input.nextInt();
		
		double sum = getSum(team);
		System.out.println("和为:"+ sum);
	}
	public static double getSum(int team) {
		double sum = 0;
		for(int i = 1; i <= team; i++) {
			sum += 1.0 / i;  //此处分子或分母必须为double类型
		}
		return sum;
	}
}
