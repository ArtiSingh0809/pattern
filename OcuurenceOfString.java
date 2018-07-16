package com.simple.problem;

public class OcuurenceOfString {
	
	public int occurence(String main, String find) {
		int totalLength = main.length();
		main = main.replaceAll(find, "");
		return (totalLength - main.length())/find.length();
	}

}
