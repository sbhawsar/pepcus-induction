package com.pepcus.core.concept.thread;

/**
 * 
 * @author Surabhi.Bhawsar
 *
 */
public class SearchResult {

	private boolean isFound;
	private String fileName;

	public boolean isIsFound() {
		return isFound;
	}

	public void setIsFound(boolean isFound) {
		this.isFound = isFound;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "SearchResult{" + "isFound=" + isFound + ", fileName=" + fileName + '}';
	}

}
