package com.may.day003;

import java.util.Scanner;

public class Test01 {
	//猜数字游戏 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你猜测的数字(1-1000)，如想退出，请输入0");
		int num = input.nextInt();
		
		int numbers = (int)(Math.random() * 100 + 1);
		boolean condition = true;
		
		while(condition) {
			if(num == 0) {
				System.out.println("你主动放弃，游戏结束");
				break;
			}
			
			if(num > numbers) {
				System.out.println("不对，猜大了");
			}else if(num == numbers) {
				System.out.println("真厉害，猜对了");
				break;
			}else {
				System.out.println("不对哦，猜小了");
			}
			System.out.println("请再次输入，如想退出，请输入0");
			num = input.nextInt();
		}
	}
}
