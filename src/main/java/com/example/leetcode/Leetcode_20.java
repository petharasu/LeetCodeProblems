package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leetcode_20 {

	public static void main(String[] args) {
//		20.Valid Parentheses
//		Boolean result=isOpener('{');
//		System.out.println("result "+result);
//		
//		Character result1=checkCharacter('{');
//		System.out.println("get the equal paranthesis "+ result1);
		
//		String s = "()[]{}{k";
		String s = "()[]{}";
		boolean result=validParantheses(s);
		System.out.println("Valid Parantheses "+result);

	}

	private static boolean validParantheses(String s) {
		Stack<Character> stack=new Stack<>();
		for(Character ch:s.toCharArray()) {
			if(Leetcode_20.isOpener(ch)) {
				stack.push(ch);
				continue;
			}else{
				Character outputchar=Leetcode_20.checkCharacter(ch);
				if(outputchar==stack.peek()) {
					stack.pop();
				}
				continue;
			}
		}
		if(stack.empty()) {
			return true;
		}
		return false;
	}

	private static Character checkCharacter(Character inputValue) {
		Map<Character,Character> listCharacter=new HashMap<>();
		listCharacter.put('}', '{');
		listCharacter.put(']', '[');
		listCharacter.put(')', '(');
		
		return listCharacter.get(inputValue);
	}

	private static Boolean isOpener(Character inputValue) {
		List<Character> openerlist=Arrays.asList('{','[','(');
		List<Character> closerlist=Arrays.asList('}',']',')');
		if(!openerlist.contains(inputValue) && !closerlist.contains(inputValue)) {
			return false;
		}
		if(openerlist.contains(inputValue)) {
			return true;
		}else if(closerlist.contains(inputValue)){
			return false;
		}
		return false;
	}
	
	

}
