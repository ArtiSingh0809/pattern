package com.simple.problem;

public class CaesarCipher {

	public String caesarCipher(String s, int k) {
        char str[] = s.toCharArray();
    	for(int i =0; i < str.length ;i++) {
    		int temp = str[i]  ;
    		if (isLying(65,90,temp)) {
    			str[i] = fillValue(65  ,temp+k );
    		}else if(temp >= 97 && temp <= 122) {
    			str[i] = fillValue(97  ,temp+k );
    			
    		}
    	}
    	return new String(str);
    }

    private static char fillValue(int start, int value) {    	
			value = ((value - start) % 26 ) + start;
			return (char) (value);
	}

	private static boolean isLying(int start , int last , int value) {
    	if (value >= start && value <= last) {
    		return true;
    	}
    	return false;
    }
    
}
