package com.pepcus.core.concept.thread;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Surabhi.Bhawsar
 *
 */
public class SearchTextWithSingleThread {


  public static void main(String[] args) {
    try {
      long startTime = System.currentTimeMillis();
      SearchTextWithSingleThread app = new SearchTextWithSingleThread();
      app.executeSearch();
      long endTime = System.currentTimeMillis();
      System.out.println("Time taken - " + (endTime - startTime) + " ms");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public void executeSearch() throws Exception {
    String searchKey = "monster";
    File searchFolder = new File("src/testdata");

    if (searchFolder.isDirectory()) {
      System.out.println("this is a directory" + searchFolder.getAbsolutePath());
    }

    File[] files = searchFolder.listFiles();
    List taskResultList = new ArrayList<>();

    for (int i = 0; i < files.length; i++) {
      System.out.println("File : " + files[i].getAbsolutePath());
      taskResultList.add(execute(files[i], searchKey));

    }
    // Iterate Futures
    ListIterator<SearchResult> iterator = taskResultList.listIterator();
    while (iterator.hasNext()) {
      SearchResult result = iterator.next();
      System.out.println(result.isIsFound());
    }

  }

  public SearchResult execute(File fileToSearch, String searchString) throws IOException {
    System.out.println("inside call : " + fileToSearch);
    String content = new String(Files.readAllBytes(fileToSearch.toPath()));
    SearchResult result = new SearchResult();
    result.setFileName(fileToSearch.getAbsolutePath());
    if (content.contains(searchString)) {
      result.setIsFound(true);
    } else {
      result.setIsFound(false);
    }

    return result;

  }
}
