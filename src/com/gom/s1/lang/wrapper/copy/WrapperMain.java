package com.gom.s1.lang.wrapper.copy;

import java.util.Scanner;

public class WrapperMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "991113-2092224";
		WrapperEx1 ex = new WrapperEx1();
		int num = 10;
		
		Integer n = Integer.valueOf(num);
		//System.out.println(n);
		n=num;//autoboxing
		num=n;//autoUnboxing
		
		boolean a =ex.ex2(input);
		if(a) {
			ex.ex1(input);
		}else {
			System.out.println("ì£¼ë?¼ë²ˆ?˜¸ ?˜¤ë¥˜ë¡œ ?‹¤?–‰?•  ?ˆ˜ ?—†?Šµ?‹ˆ?‹¤.");
		}
		
		
		
//		double d = 3.14;
//		Double dd = d;
//
//		String nums = "3.14";
//		double check = Double.parseDouble(nums);
//		System.out.println(check+1.2);
//		
//		int num3 = Integer.parseInt("123");
 
		
		
		
//		Integer num2 = (int)d;
//		num2=dd;
//		
//		d=dd;
//		num2=(int)d;
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Long.MAX_VALUE);
		

	}

}
