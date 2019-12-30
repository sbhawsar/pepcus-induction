package com.pepcus.core.concept.collection;

import java.security.SecureRandom;
import java.util.Map;
import java.util.TreeMap;

/**
 * To demonstrate TreeMap collection performance
 * 
 * @author kapilesh.israni
 *
 */
public class TreeMapPerformance {
	
	static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom secureRandom = new SecureRandom();
	static int count = 1000000;

	public static void main(String[] args) {
		Map<String, String> random = new TreeMap<String, String>();
		long startTime = System.currentTimeMillis();
		System.out.println("** Performance Checker **\n");
		System.out.println("** Creating TreeMap for 10 Lakh elements **\n");
		for (int i = 1; i <= count; i++) {
			random.put(randomString(10), randomString(10));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("** TreeMap Created for 10 Lakh elements**\n");
		System.out.println("Time taken - " + (endTime - startTime) + " ms");
	}

	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(SOURCE.charAt(secureRandom.nextInt(SOURCE.length())));
		}
		return sb.toString();
	}
}
