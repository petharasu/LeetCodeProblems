package com.example.leetcode;

import java.util.Arrays;

public class Leetcode_58 {
	public static void main(String args[]) {
//		58. Length of Last Word
//		String s = "Hello World";
		String s = "luffy is still joyboy";
//		String s = "   fly me   to   the moon  ";
		int result=lengthofLastword(s.trim());
		System.out.println("length of last word "+ result);
	}

	private static int lengthofLastword(String s) {
		String[] splitString=s.split(" ");
//		Arrays.toString(splitString).lastIndexOf(s);
		return splitString[splitString.length-1].length();
		
	}

}
