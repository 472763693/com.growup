package com.may.day003;

import java.util.Scanner;

public class Test_s04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字:");
		int num = input.nextInt();
		
		System.out.println("请输入项数:");
		int team = input.nextInt();
		
		int sum = getSum(num, team);
		System.out.println("和为:" + sum);
	}
	
	public static int getSum(int num, int team) {
		int sum = 0;
		for(int i = 0; i < team; i++) {
			sum += num;
			num += num * 10;  //它的后一项，等于它本身乘以10，再加上它本身
		}
		return sum;
	}
}
