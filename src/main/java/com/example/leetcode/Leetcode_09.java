package com.example.leetcode;

public class Leetcode_09 {

	public static void main(String[] args) {
		int x=121;
		boolean result=chechPalindrome(x);
		System.out.println("Palindrome "+ result);

	}

	private static boolean chechPalindrome(int x) {
		StringBuilder sb=new StringBuilder(String.valueOf(x));
		
		if(String.valueOf(x).equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}

}
