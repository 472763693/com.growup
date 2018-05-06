package com.may.day002;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("请输入3个整数，分别代表a、b、c的值:");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] arr = {a, b, c};
		System.out.println("您输入的是:");
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("进行升序排序后，结果为:");
		System.out.println("a = " + arr[0] + ", b = " + arr[1] + ", c = " + arr[2]);
	}
}
