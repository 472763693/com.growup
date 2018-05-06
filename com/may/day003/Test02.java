package com.may.day003;

import java.util.Scanner;

public class Test02 {
	//随机加法运算器
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("即将开始10次随机加法运算考试，如需退出，请输入0");
			
		int count = 1;
		int score = 0;
		
		while(count < 11) {
			int addend1 = (int)(Math.random() * 100 + 1);
			int addend2 = (int)(Math.random() * 100 + 1);
			
			System.out.println("第" + count + "题" + addend1 + " + " + addend2 + " = ?");
			
			int num = input.nextInt();
			
			if(num == 0 || num == -1) {
				System.out.println("你主动放弃，考试结束");
				System.out.println("您的分数为:" + score);
				break;
			}
			if(num == addend1 + addend2) {
				System.out.println("答对了!");
				score++;
			}else {
				System.out.println("答错了");
			}
			count++;
			if(count == 11) {
				System.out.println("您的分数为:" + score);
				break;
			}
		}
	}
}
