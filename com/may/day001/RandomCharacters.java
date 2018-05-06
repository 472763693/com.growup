package com.may.day001;

public class RandomCharacters {
	//随机生成6位字符
	public static void main(String[] args) {
		//定义一个空字符串
		String result = "";
		
		for(int i = 0; i < 6; i++) {
			//生成一个97-122的int型整数
			int intVal = (int) (Math.random() * 26 + 97);
			
			//将生成的int型整数强制转换成char类型
			result += (char)intVal;
		}
		System.out.println(result);
	}
}