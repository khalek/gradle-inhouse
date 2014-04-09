package se.softhouse.android;

public class Word {
	private String word; 
	
	public Word(String word) {
		this.word = word;
	}
	
	public String getContent() {
		return word;
	}

	// Comment for gerrit test.	
	public boolean isPalindrome() {
		String possiblePalindrome = word.toLowerCase();		
		for (int i = 0, j = possiblePalindrome.length() - 1; i <= j; i++, j--) {
			if (possiblePalindrome.charAt(i) != possiblePalindrome.charAt(j))
				return false;
		}
		return true;
	}
}
