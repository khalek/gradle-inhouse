package se.softhouse.android;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {
	@Test
	public void testContent() {
		Word word = new Word("whatever");
		assertEquals("whatever", word.getContent());
	}

	@Test
	public void testPalindrome() {
		Word word = new Word("Anna");
		assertTrue(word.isPalindrome());
	}

	@Test
	public void testIsNotPalindrome() {
		Word word = new Word("Paris");
		assertTrue(!word.isPalindrome());
	}
}
