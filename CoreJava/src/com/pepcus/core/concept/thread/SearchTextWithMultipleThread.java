package com.pepcus.core.concept.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Surabhi.Bhawsar
 *
 */
public class SearchTextWithMultipleThread {

	public static void main(String[] args) {
		try {
			SearchTextWithMultipleThread app = new SearchTextWithMultipleThread();
			app.executeSearch();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void executeSearch() throws Exception {
		long startTime = System.currentTimeMillis();

		String searchKey = "monster";
		File searchFolder = new File("src/testdata");

		if (searchFolder.isDirectory()) {
			System.out.println("this is a directory" + searchFolder.getAbsolutePath());
		}

		File[] files = searchFolder.listFiles();
		List<Future> taskResultList = new ArrayList<>();

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		for (int i = 0; i < files.length; i++) {
			System.out.println("File : " + files[i].getAbsolutePath());
			taskResultList.add(executorService.submit(new SearchOperation(files[i], searchKey)));
		}

		// Iterate Futures
		ListIterator<Future> iterator = taskResultList.listIterator();
		while (iterator.hasNext()) {
			Future<SearchResult> futureElement = iterator.next();
			if (futureElement.isDone()) {
				System.out.println("Future element is done");
				System.out.println(futureElement.get());
			}
			executorService.shutdown();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken - " + (endTime - startTime) + " ms");

	}
}
