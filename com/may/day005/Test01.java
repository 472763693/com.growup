package com.may.day005;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Test01.outStudnetsPerformance();
	}
	
	public static void outStudnetsPerformance() {
		System.out.println("请输入学生人数:");
		Scanner input = new Scanner(System.in);
		int students = input.nextInt();
		int[] performance = new int[students];
		for(int i = 1; i <= students; i++) {
			System.out.println("请输入第" + i + "个学生的成绩:");
			performance[i -1] = input.nextInt();
			System.out.println("学生" + i + "的成绩为："+ performance[i -1] + "\n");
		}
		System.out.println("成绩信息为:" + Arrays.toString(performance));
		
		//成绩排序
		int temp = 0;
		for(int i = 0; i <= performance.length; i++) {
			for(int j = i + 1; j < performance.length; j++) {
				if(performance[i] > performance[j]) {
					temp = performance[i];
					performance[i] = performance[j];
					performance[j] = temp;
				}
			}
		}
		System.out.println("成绩排名:" + Arrays.toString(performance));
	}
} 
