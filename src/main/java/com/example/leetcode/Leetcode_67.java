package com.example.leetcode;

public class Leetcode_67 {

	public static void main(String[] args) {
//		67. Add Binary
		String a = "11", b = "1";
		String result=addBinary(a,b);
		System.out.println(result);

	}

	private static String addBinary(String a, String b) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(a,2);
		System.out.println("num1 "+num1);
		int num2=Integer.parseInt(b,2);
		int sum=num1+num2;
		System.out.println("sum "+sum);
		return Integer.toBinaryString(sum);
	}

}
