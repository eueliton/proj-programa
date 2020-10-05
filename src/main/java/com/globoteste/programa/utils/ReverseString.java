package com.globoteste.programa.utils;

import org.springframework.stereotype.Component;

@Component
public class ReverseString {

	public static String reverse(String str) {
		String stringInvertida = "";
		char[] stringArray = str.toCharArray();
		for (int i = stringArray.length - 1; i >= 0; i--) {
			stringInvertida += stringArray[i];
		}

		return stringInvertida;
	}

}
