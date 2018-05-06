package com.may.day004;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	//求数组元素中的最大值
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.printArrayValue();
	}
	
	public static void printArrayValue() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组的长度");
		int[] arr = new int[input.nextInt()];
		int max = 0;  //中间量
		
		//填充数组
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("数组中的元素分别为:" + Arrays.toString(arr));
		System.out.println("数组中最大的元素为:" + max);
	}
}
