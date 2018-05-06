package com.may.day001;

public class AutomaticPromotion {
	//表达式的自动提升
	public static void main(String[] args) {
		//定义1个short类型的变量
		short sValue = 5;
		
		//表达式中的sValue将自动提升为int类型
		//将1个int类型赋值给short时，会报错
		//sValue = sValue - 2;  报错，因为两者之间的类型不同
		
		byte b = 40;
		char c = 'a';
		int i = 23;
		double d = .314;
		
		//'a'的unicode编码为97
		double result = b + c + i * d;
		System.out.println("b的值为:" + b);
		System.out.println("c的值为:");
		System.out.println(c);
		System.out.println("b与c的和为：");
		System.out.println(b + c);    //char类型是16位的,底层采用unicode编码保存
		System.out.println(result);
	}
}
