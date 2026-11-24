package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.CharValue;

public class Leetcode_14 {

	public static void main(String[] args) {
//		14. Longest Common Prefix
//		String[] sb= {"flower","flow","flight"};
		String[] sb = { "dog", "racecar", "car" };
//		String result=commonPrefix(sb);
		String result = characterSplit(sb);
		System.out.println("common prefix " + result);
	}

	private static String characterSplit(String[] sb) {
		String commonPrefix = "";
		char commonchar = 0;
		for (int i = 0; i < sb[0].length(); i++) {
			for (String inputvalue : sb) {
				var gettheCharacter = Leetcode_14.getcommonPrefix(inputvalue);
				if (sb[0].charAt(i) == gettheCharacter.get(i)) {
					commonchar = gettheCharacter.get(i);
					continue;
				} else if (sb[0].charAt(i) != gettheCharacter.get(i)) {
					return commonPrefix;
				}

			}
			commonPrefix += commonchar + "";
		}
		return commonPrefix;
	}

	private static List<Character> getcommonPrefix(String inputstring) {
		List<Character> listofChar = new ArrayList<Character>();
		for (Character inputchar : inputstring.toCharArray()) {
			listofChar.add(inputchar);
		}
		System.out.println(listofChar);
		return listofChar;

	}

}
