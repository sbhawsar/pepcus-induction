package com.pepcus.core.concept.collection;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * To demonstrate HashMap collection performance
 * 
 * @author kapilesh.israni
 *
 */
public class HashMapPerformance {

	static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom secureRandom = new SecureRandom();
	static int count = 1000000;

	public static void main(String[] args) {
		Map<String, String> random = new HashMap<String, String>();
		long startTime = System.currentTimeMillis();
		System.out.println("** Performance Checker **\n");
		System.out.println("** Creating HashMap for 10 Lakh elements **\n");
		for (int i = 1; i <= count; i++) {
			random.put(randomString(10), randomString(10));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("** HashMap Created for 10 Lakh elements**\n");
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