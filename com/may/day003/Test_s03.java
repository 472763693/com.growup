package com.may.day003;

public class Test_s03 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println("iµÄÖµÎª:" + i);  //0 1 3 4
		}
	}
}
