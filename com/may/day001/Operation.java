package com.may.day001;

public class Operation {
	//String s="1234567" 要将其拆为一个一个的数字 存放在数组了  然后进行求和运算
	
	public static void main(String[] args) {
		String s = "1234567";
		int[] num = new int[s.length()];  //用于存放数字的数组
		
		for(int i = 0; i < s.length(); i++) {
			
			//将s中的内容通过""分割
			//charAt() 方法用于返回指定索引处的字符
			num[i] = Integer.parseInt(s.charAt(i) + "");
		}
		
		//查看数组中的元素
		for(int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}
}
