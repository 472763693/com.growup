package com.may.day002;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//应缴税款 = (税前工资 - 扣除数) * 税率 - 速算扣除数
		//taxPayment = (preTax - deduction) * taxRat - rapid
		
		System.out.println("请输入您的税前工资:");
		Scanner input = new Scanner(System.in);
		double preTax = input.nextInt();
		
		int deduction = 3500;
		double payPart = preTax - deduction;
		
		//税率
		double[] taxRat = {0.03, 0.1, 0.2, 0.25, 0.3, 0.35, 0.45};
		
		//扣除数
		int[] rapid = {0, 105, 555, 1005, 2755, 5505, 13505};
		
		//应缴税款
		double taxPayment = 0;
		
		if(preTax <= 3500) {
			System.out.println("您的工资标准低于扣除数，不用缴纳个人所得税!");
		}else if(payPart <= 1500) {
			taxPayment = payPart * taxRat[0] - rapid[0];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else if(payPart > 1500 && payPart <= 4500) {
			taxPayment = payPart * taxRat[1] - rapid[1];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else if(payPart > 4500 && payPart <= 9000) {
			taxPayment = payPart * taxRat[2] - rapid[2];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else if(payPart > 9000 && payPart <= 35000) {
			taxPayment = payPart * taxRat[3] - rapid[3];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else if(payPart > 35000 && payPart <= 55000) {
			taxPayment = payPart * taxRat[4] - rapid[4];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else if(payPart > 55000 && payPart <= 80000) {
			taxPayment = payPart * taxRat[5] - rapid[5];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}else {
			taxPayment = payPart * taxRat[6] - rapid[6];
			System.out.println("您应缴纳的所得税为:" + taxPayment);
		}
	}
}
