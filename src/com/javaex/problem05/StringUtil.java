package com.javaex.problem05;

public class StringUtil {

	public static String concatString(String[] str) {
		String total = "";
		for (String s : str) {
			total += s;
		}
		return total;
	}

}
