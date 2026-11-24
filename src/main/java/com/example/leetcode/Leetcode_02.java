package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_02 {

	public static void main(String[] args) {
//		2.Add two Numbers
		int[] l1 = {2,4,3}, l2 = {5,6,4};
		List<Integer> output=addTwoNumbers(l1,l2);
		System.out.println("final Result " + output);
	}

	private static List<Integer> addTwoNumbers(int[] l1, int[] l2) {
		List<Integer> output=new ArrayList<Integer>();
		String str = "",str1="";
		for(int i=l1.length-1;i>=0;i--) {
			str+=l1[i];
			System.out.println("output"+str);
		}
		for(int i=l2.length-1;i>=0;i--) {
			str1+=l2[i];
			System.out.println("output"+str1);
		}
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str1);
		int c=a+b;
		String additionResult=String.valueOf(c);
		System.out.println("string value"+ c);
		for(int i=additionResult.length()-1;i>=0;i--) {
			output.add(Integer.parseInt(additionResult.charAt(i)+""));
		}
		return output;
	}

}
