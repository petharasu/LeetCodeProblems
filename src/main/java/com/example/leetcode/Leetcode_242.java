package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_242 {

	public static void main(String[] args) {
//		242. Valid Anagram
		String s = "anagram", t = "nagar";
		boolean isAnagram=checkAnagram(s,t);
		System.out.println("Anagram Result "+ isAnagram);
	}

	private static boolean checkAnagram(String s, String t) {
		Map<Character,Integer> output=new HashMap<>();
		boolean setanagram=false;
		if(s.length()!=t.length()) {
			return false;
		}
		
		for(Character inputChar:s.toCharArray()) {
			output.put(inputChar, output.getOrDefault(inputChar, 0)+1);
		}
		for(Character inputChar1: t.toCharArray()) {
			output.put(inputChar1, output.getOrDefault(inputChar1, 0)-1);
		}
		
		for(Character getKeys:output.keySet()) {
			if(output.get(getKeys)==0) {
				setanagram=true;
				continue;
			}else {
				setanagram=false;
				break;
			}
		}
		
		return setanagram;
	}

	

}
