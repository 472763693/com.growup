package com.may.day004;

import java.util.Scanner;

public class Test01 {
	//10道随机数加法运算题
	public static void main(String[] args) {
		System.out.println("即将开始10道随机数加法运算考试，如需退出，请输入0");
		int condition = 10;
		Test01 t = new Test01();
		t.printAnser(condition);  //调用考试方法
	}
	
	public static void printAnser(int condition) {
		Scanner input = new Scanner(System.in);		
		int sum = 0;  //和
		int score = 0; //分数
		
		for(int i = 1; i <= condition; i++) {
			int addend1 = (int)(Math.random() * 100 + 1);
			int addend2 = (int)(Math.random() * 100 + 1);
			System.out.println("第" + i + "题，" + addend1 + " + " + addend2 + " = ?");
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("你选择了弃权，已经退出考试");
				break;
			}
			
			if(num == addend1 + addend2) {
				System.out.println("答对了");
				score++;
			}else {
				System.out.println("答错了，请仔细");
			}
		}
		System.out.println("考试结束，你的成绩为:" + score);
	}
}
