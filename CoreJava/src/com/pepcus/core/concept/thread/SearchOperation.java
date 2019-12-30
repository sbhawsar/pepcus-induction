package com.pepcus.core.concept.thread;

import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.Callable;

/**
 * 
 * @author Surabhi.Bhawsar
 *
 */
public class SearchOperation implements Callable<SearchResult>
{
     File fileToSearch;
     String searchString;
     
    public SearchOperation(File fileName, String searchString){
      this.fileToSearch = fileName;
      this.searchString = searchString;
    }

    @Override
    public SearchResult call() throws Exception {
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
