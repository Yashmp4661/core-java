package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class Assertions {
	@Test
	public void checkassertequal() {
		int res=1;
		int exp=2;
		assertEquals(res,exp);
	}
	@Test
	
	public void tsetcheckassertequal() {
		assertFalse("Hello".contains("m"));
	}
	@Test
	public void testNull() {
		String s="hello";
		assertNotNull(s);
	}

}
