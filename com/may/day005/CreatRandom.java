package com.may.day005;

import java.util.Arrays;
import java.util.Scanner;

public class CreatRandom {
	//输入数组长度，生成该范围内的随机数数组
	public static void main(String[] args) {
		int[] arr = CreatRandom.outArray();
		System.out.println("生成的随机数数组为：" + Arrays.toString(arr));
	}
	
	public static int[] outArray() {
		System.out.println("请输入数组的长度:");
		Scanner input = new Scanner(System.in);
		int alength = input.nextInt();
		int[] randomArray = new int[alength];
		
		for(int i = 0; i < alength; i++) {
			int num = (int)(Math.random() * alength);
			randomArray[i] = num;
		}
		
		return randomArray;
	}
}
