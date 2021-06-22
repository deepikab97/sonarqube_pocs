package com.cybage.DeployProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
	String input1="noon";
	App app = new App();
	boolean expected =true;
	
	
	@Test
	public void isPalindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}
}
