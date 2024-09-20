package com.tnsif.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FirstTest {
	@Disabled()
	@DisplayName("My Test")
	@Test
	void display() {
		System.out.println("My test case");
	}

}
