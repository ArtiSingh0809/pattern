package com.simple.problem;

public class StringReverse {

	public String reverse(String main) {
		char[] str = main.toCharArray();
		for(int i = 0 , j = (str.length -1) ; i < str.length/2 ;i++,j--) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
		return new String(str);
	}
}
