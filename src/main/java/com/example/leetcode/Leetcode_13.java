package com.example.leetcode;

import java.util.Map;

public class Leetcode_13 {

	public static void main(String[] args) {
//		need to check with ariuvv
//		String s = "III";
//		String s ="LVIII";
		String s= "MCMXCIV";
		Integer result=RomantoInteger(s);
		System.out.println(s +" " + result);

	}

	private static Integer RomantoInteger(String s) {
		Integer addingValue = 0;
		Map<Character,Integer> hm=getRomanNumerals();
		for(Character inputchar:s.toCharArray()) {
			if(hm.containsKey(inputchar)) {
				addingValue+=hm.get(inputchar);
			}
		}
		
		return addingValue;
	}

	private static Map<Character, Integer> getRomanNumerals() {
		Map<Character,Integer> hms=
		Map.of(
				'I',1,
				'V', 5,
				'X',10,
				'L',50,
				'C',100,
				'D',500,
				'M',1000
				);
		
		return hms;
	}

}
