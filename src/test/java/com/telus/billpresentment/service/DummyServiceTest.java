package com.telus.billpresentment.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DummyServiceTest {

	private int b;

	@BeforeEach
	public void setUp() throws Exception {
		
		b = 1;
	}

	@Test
	public void testSetAppConfig() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void testRun() {
		Assert.assertEquals(1, b);
	}

	@Test
	public void testDummyService() {
		Assert.assertEquals(1, b+1);
	}

}
